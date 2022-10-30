package Begin.begin09;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите неотрицательное число a: ");
        double firstA = scan.nextDouble();
        if (firstA < 0) {                   // Проверка условия на знак числа
            System.out.println("Вы ввели отрицательное число! Повторите попытку.");
            while (firstA < 0) {            // Повтор ввода числа до тех пор, пока не будет введено неотрицательное
                System.out.print("Введите неотрицательное число a: ");
                firstA = scan.nextDouble();
            }
        }
        System.out.print("Введите неотрицательное число b: ");
        double secondB = scan.nextDouble();
        if (secondB < 0) {                  // Проверка условия на знак числа
            System.out.println("Вы ввели отрицательное число! Повторите попытку.");
            while (secondB < 0) {           // Повтор ввода числа до тех пор, пока не будет введено неотрицательное
                System.out.print("Введите неотрицательное число b: ");
                secondB = scan.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double sqrt = Math.sqrt(firstA * secondB);// Расчёт среднего геометрического: sqrt (a * b)
        System.out.println("Среднее геометрическое двух числе равно: " + sqrt);
    }
}