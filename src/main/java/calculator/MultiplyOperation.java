
package calculator;

public class MultiplyOperation implements Operation {
    @Override
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.multiply(b);
    }
}
