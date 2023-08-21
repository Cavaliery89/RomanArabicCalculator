public class RomanNumbersCalculation {
    public static String[] initialInput = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static String[] romanNumbers = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static int[] arabicNumbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int romanToArabicTransition(String a) {
        int x = 0;
        for (int i = 0; i < initialInput.length; i++) {
            if (a.equals(initialInput[i])) {
                x = i + 1;
                break;
            }
        }
        if (x == 0) {
            throw new IllegalArgumentException("Неподходящее число (не от I до X)");
        }
        return x;
    }

    // перевод арабских чисел в римские
    public static String arabicToRomanTransition(int a) {
        StringBuilder romanNumber = new StringBuilder();
        int i = 0;
        while (a > 0) {
            if ((a - arabicNumbers[i]) >= 0) {
                a -= arabicNumbers[i];
                romanNumber.append(romanNumbers[i]);
            } else i++;
        }
        return romanNumber.toString();
    }

    public static String addition(String a, String b) {
        int x = romanToArabicTransition(a);
        int y = romanToArabicTransition(b);
        int result = x + y;
        return arabicToRomanTransition(result);
    }

    public static String subtraction(String a, String b) {
        int x = romanToArabicTransition(a);
        int y = romanToArabicTransition(b);
        int result = x - y;
        if (result <= 0) {
            throw new ArithmeticException("В римской системе нет отрицательных чисел и нуля");
        }
        return arabicToRomanTransition(result);
    }

    public static String division(String a, String b) {
        int x = romanToArabicTransition(a);
        int y = romanToArabicTransition(b);
        int result = x / y;
        return arabicToRomanTransition(result);
    }

    public static String multiplication(String a, String b) {
        int x = romanToArabicTransition(a);
        int y = romanToArabicTransition(b);
        int result = x * y;
        return arabicToRomanTransition(result);
    }
}
