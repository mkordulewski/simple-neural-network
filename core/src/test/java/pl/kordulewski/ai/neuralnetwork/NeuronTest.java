package pl.kordulewski.ai.neuralnetwork;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

/**
 * @see Neuron
 *
 * @author Michał Kordulewski
 */
public class NeuronTest {

    /**
     * @see Neuron#registerSource(Source)
     */
    @Test
    public void testRegisterSource() {
        Neuron neuron = new Neuron();
        Neuron neuron2 = new Neuron();
        neuron2.registerSource(new StaticSource(-1));
        neuron2.registerSource(new StaticSource(0));
        neuron.registerSource(neuron2);
        neuron.registerSource(new StaticSource(0));
        neuron.registerSource(new StaticSource(1));
        double value = neuron.getValue();
        neuron.expected(1.0);
    }

    /**
     * @see Neuron#getSources()
     */
    @Test
    public void testGetSources0() {
        Neuron neuron = new Neuron();
        assertThat(neuron.getSources().size()).isEqualTo(0);
    }

    /**
     * @see Neuron#registerSource(Source)
     * @see Neuron#getSources()
     */
    @Test
    public void testGetSources() {
        Neuron neuron = new Neuron();
        neuron.registerSource(new StaticSource(-1));
        neuron.registerSource(new StaticSource(0));
        neuron.registerSource(new StaticSource(1));
        assertThat(neuron.getSources().size()).isEqualTo(3);
    }

    /**
     * @see Neuron#getValue()
     */
    @Test
    public void testGetValue() {
        // TODO
    }

}
