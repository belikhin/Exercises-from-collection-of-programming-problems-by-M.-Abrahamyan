package Begin.begin20;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение координаты х1 первой точки: ");
        double pointOneX1 = scanner.nextDouble();
        System.out.print("Введите значение координаты y1 первой точки: ");
        double pointOneY1 = scanner.nextDouble();
        System.out.print("Введите значение координаты х2 первой точки: ");
        double pointTwoX2 = scanner.nextDouble();
        System.out.print("Введите значение координаты y2 первой точки: ");
        double pointTwoY2 = scanner.nextDouble();

        System.out.println("Расчёт:");
        double interval = Math.sqrt(Math.pow(pointTwoX2 - pointOneX1, 2) + Math.pow(pointTwoY2 - pointOneY1, 2));
        System.out.println("Расстояние между двумя точками составляет: " + interval);
    }
}