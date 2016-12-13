package pl.kordulewski.ai.neuralnetwork.activation;

/**
 * @author Michał Kordulewski
 */
public class BinaryStepFunction implements ActivationFunction {

    @Override
    public double calculate(double value) {
        if (value>=0)
            return 1;
        else
            return 0;
    }

}
