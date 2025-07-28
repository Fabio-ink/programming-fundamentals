package basics.operators.arithmetic.util.operators;

public class Division extends Operation {
    
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}