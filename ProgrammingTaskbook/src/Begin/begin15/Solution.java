package Begin.begin15;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Введите площадь круга: ");
        double circleArea = scanner.nextDouble();
        if (circleArea <= 0) {
            System.out.println("Вы ввели значение площади круга меньше или равное нулю. Повторите ввод.");
            while (circleArea <= 0) {
                System.out.print("Введите площадь круга: ");
                circleArea = scanner.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double circleRadius = Math.sqrt(circleArea / pi);   // Предварительный расчёт радиуса для последующих расчётов: R = sqrt(S / pi)
        double circumference = 2 * pi * circleRadius;       // Расчёт длины окружности: L = 2 * pi * R
        double circleDiameter = circumference / pi;         //Расчёт диаметра круга: D = L / pi
        System.out.println("Диаметр круга D = " + circleDiameter);
        System.out.println("Длина окружности L = " + circumference);
    }
}