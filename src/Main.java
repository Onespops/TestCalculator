import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи арифметическое выражение: ");
        String input = scanner.nextLine();

        String result = calc(input);
        System.out.println(result);
    }

    public static String calc(String input) {
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Cтрока не является математической операцией");
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operator = parts[1];

        if (a <= 1 || a >= 10 || b <= 1 || b >= 10) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Числа не входят в диапазон от 1 до 10");
            }
        }
        int result;
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
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                result = a / b;
                break;

            default:
                throw new IllegalStateException("Недопустимая операция");
        }
        return String.valueOf(result);
    }
}
