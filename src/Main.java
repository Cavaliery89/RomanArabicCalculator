
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два операнда от 1 до 10 и один оператор (+, -, /, *) римскими или арабскими цифрами через пробел");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));


    }

    public static String calc(String input) {
        String[] inputArray = input.split(" ");
        if (inputArray.length != 3) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        String firstOperand = inputArray[0];
        String operator = inputArray[1];
        String secondOperand = inputArray[2];

        if ((firstOperand.matches("\\d+") && secondOperand.matches("[IVXLC]+")) || (firstOperand.matches("[IVXLC]+") && secondOperand.matches("\\d+"))) {
            throw new IllegalArgumentException("Используются одновременно разные системы счисления");
        }
        if (!((firstOperand.matches("\\d+") && secondOperand.matches("\\d+")) || (firstOperand.matches("[IVXLC]+") && secondOperand.matches("[IVXLC]+"))))
        {
            throw new IllegalArgumentException("Вы ввели неверный формат операндов");
        }
        if (operator.matches("[^+*\\-/]")) {
            throw new IllegalArgumentException("Вы ввели неверный оператор");
        }
        if (firstOperand.matches("\\d+") && secondOperand.matches("\\d+")) {
            return switch (operator) {
                case "+" -> ArabicNumbersCalculation.addition(firstOperand, secondOperand);
                case "-" -> ArabicNumbersCalculation.subtraction(firstOperand, secondOperand);
                case "/" -> ArabicNumbersCalculation.division(firstOperand, secondOperand);
                default -> ArabicNumbersCalculation.multiplication(firstOperand, secondOperand);
            };
        }
        if (firstOperand.matches("[IVXLC]+") && secondOperand.matches("[IVXLC]+")) {
            return switch (operator) {
                case "+" -> RomanNumbersCalculation.addition(firstOperand, secondOperand);
                case "-" -> RomanNumbersCalculation.subtraction(firstOperand, secondOperand);
                case "/" -> RomanNumbersCalculation.division(firstOperand, secondOperand);
                default -> RomanNumbersCalculation.multiplication(firstOperand, secondOperand);
            };

        }

        return "0";
    }

}
