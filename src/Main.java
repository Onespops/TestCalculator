import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи арифметическое выражение: ");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception// т.к " + e.getMessage());
        }
    }

    public static String calc(String input) {

        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("строка не является математической операцией");
        }


            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);


        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("числа не входят в диапазон от 1 до 10");
        }
        int result;
        String operator = parts[1];
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
//                if (b == 0) {
//                    throw new ArithmeticException("Деление на ноль недопустимо");
//                }
                result = a / b;
                break;

            default:
                throw new IllegalArgumentException("Недопустимая операция");
        }
        return String.valueOf(result);
    }
}
