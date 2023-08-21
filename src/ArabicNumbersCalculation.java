class ArabicNumbersCalculation {
    public static String addition(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x < 1 || y < 1 || x > 10 || y > 10) {
            throw new IllegalArgumentException("Неподходящее число (не от 1 до 10)");
        } else return String.valueOf(x + y);
    }

    public static String subtraction(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x < 1 || y < 1 || x > 10 || y > 10) {
            throw new IllegalArgumentException("Неподходящее число (не от 1 до 10)");
        } else return String.valueOf(x - y);
    }

    public static String multiplication(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x < 1 || y < 1 || x > 10 || y > 10) {
            throw new IllegalArgumentException("Неподходящее число (не от 1 до 10)");
        } else return String.valueOf(x * y);
    }

    public static String division(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x < 1 || y < 1 || x > 10 || y > 10) {
            throw new IllegalArgumentException("Неподходящее число (не от 1 до 10)");
        } else return String.valueOf(x / y);
    }
}
