
package calculator;

public class DevideOperation implements Operation {
    @Override
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.divide(b);
    }
}

