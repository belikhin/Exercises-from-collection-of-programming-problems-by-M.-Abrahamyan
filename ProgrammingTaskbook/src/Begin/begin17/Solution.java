package Begin.begin17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение точки А: ");
        double pointA = scanner.nextDouble();
        System.out.print("Введите значение точки B: ");
        double pointB = scanner.nextDouble();
        System.out.print("Введите значение точки C: ");
        double pointC = scanner.nextDouble();

        System.out.println("Расчёт:");
        double lengthAC = Math.abs(pointA - pointC);
        double lengthBC = Math.abs(pointB - pointC);
        double sumACBC = lengthAC + lengthBC;
        System.out.println("Длина отрезка АС = " + lengthAC);               // Расчёт длины отрезка АС: |A - C|
        System.out.println("Длина отрезка ВС = " + lengthBC);               // Расчёт длины отрезка BC: |B - C|
        System.out.println("Сумма отрезков АС и ВС равна: " + sumACBC);     // Расчёт произведения длин отрезков АС и ВС: |A - C| * |B - C|
    }
}