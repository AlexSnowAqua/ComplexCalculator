
package calculator;

public class CalculatorApp {

    public static void main(String[] args) {
        AppLogger.logInfo("Запуск калькулятора комплексных чисел");

        // Пример работы с комплексными числами
        ComplexNumber num1 = new ComplexNumber(4, 3); // 4 + 3i
        ComplexNumber num2 = new ComplexNumber(1, 2); // 1 + 2i

        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);
        ComplexNumber quotient = num1.divide(num2);

        // Логирование результатов
        AppLogger.logInfo("Сложение: " + sum);
        AppLogger.logInfo("Умножение: " + product);
        AppLogger.logInfo("Деление: " + quotient);
    }
}
