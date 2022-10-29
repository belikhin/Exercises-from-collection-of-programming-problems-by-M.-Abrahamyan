package Begin.begin07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Введите радиус окружности: ");
        double circleRadius = scan.nextDouble();

        System.out.println("Расчёты:");
        double circumference = 2 * pi * circleRadius;           // Расчёт длины окружности: L = 2 * pi * R
        System.out.println("Длина окружности L = " + circumference);
        double circleArea = pi * Math.pow(circleRadius, 2);     // Расчёт площади круга: S = pi * R^2
        System.out.println("Площадь круга S = " + circleArea);
    }
}