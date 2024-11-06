
package calculator;

public class AddOperation implements Operation {
    @Override
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.add(b);
    }
}

