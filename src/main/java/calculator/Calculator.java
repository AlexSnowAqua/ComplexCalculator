
package calculator;

public class Calculator {
    private OperationFactory operationFactory;

    public Calculator() {
        this.operationFactory = new OperationFactory();
    }

    public ComplexNumber performOperation(String operationType, ComplexNumber a, ComplexNumber b) {
        Operation operation = operationFactory.getOperation(operationType);
        return operation.perform(a, b);
    }
}
