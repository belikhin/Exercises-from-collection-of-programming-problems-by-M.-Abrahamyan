package Begin.begin14;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Введите длину окружности: ");
        double circumference = scanner.nextDouble();
        if (circumference <= 0) {
            System.out.println("Длина окружности не может быть меньше или равна нулю. Повторите ввод.");
            while (circumference <= 0) {
                System.out.print("Введите длину окружности: ");
                circumference = scanner.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double circleRadius = circumference / (2 * pi);
        double circleArea = pi * Math.pow(circleRadius, 2);
        System.out.println("Радиус окружности R = " + circleRadius);
        System.out.println("Площадь круга S = " + circleArea);
    }
}