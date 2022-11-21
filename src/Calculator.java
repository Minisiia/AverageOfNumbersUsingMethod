import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введіть друге число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введіть третє число");
        int thirdNumber = scanner.nextInt();
        System.out.println(calculate(firstNumber, secondNumber, thirdNumber));

    }

    static double calculate(int a, int b, int c) {
        double average = ((double) a + b + c) / 3; // кастинг до double першого числа, щоб можливо було отримувати у результаті ділення дійсні числа
        return average;
    }
}
