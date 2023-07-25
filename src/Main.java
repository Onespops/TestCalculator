import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в консоль со значениями переменных от 1 до 10");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);

    }

    public static String calc(String input) {


            String[] parts = input.split(" ");
                if (parts.length != 3){
                    System.out.println("throws Exception //т.к. строка не является математической операцией");
                }

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            String operator = parts[1];

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

                    if (a <= 1 || a >= 1 || b <= 1 || b >= 10) {
                        System.out.println("Числа не входят в диапазон от 1 до 10");
                    }
                    result = a / b;
                    break;

                default:
                    throw new IllegalStateException("Недопустимая операция");
            } return String.valueOf(result);


        }
    }
