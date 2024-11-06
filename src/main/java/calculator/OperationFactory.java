
package calculator;

public class OperationFactory {

    // Указываем, что метод возвращает объект типа Operation
    public static Operation getOperation(String operation) {
        switch (operation) {
            case "add":
                return new AddOperation();
            case "multiply":
                return new MultiplyOperation();
            case "divide":
                return new DevideOperation();
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operation);
        }
    }
}

