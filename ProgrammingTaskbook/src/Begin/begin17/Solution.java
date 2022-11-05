package Begin.begin17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату х точки А: ");
        double coordinateXOfA = scanner.nextDouble();
        System.out.print("Введите координату y точки А: ");
        double coordinateYOfA = scanner.nextDouble();
        System.out.print("Введите координату х точки B: ");
        double coordinateXOfB = scanner.nextDouble();
        System.out.print("Введите координату y точки B: ");
        double coordinateYOfB = scanner.nextDouble();
        System.out.print("Введите координату х точки C: ");
        double coordinateXOfC = scanner.nextDouble();
        System.out.print("Введите координату y точки C: ");
        double coordinateYOfC = scanner.nextDouble();

        System.out.println("Расчёт:");
        double lengthAC = Math.sqrt((Math.pow(coordinateXOfC - coordinateXOfA, 2)) +
                         (Math.pow(coordinateYOfC - coordinateYOfA, 2)));               // Расчёт длины отрезка АС: sqrt((x2-x1)^2 + (y2-y1)^2)
        double lengthBC = Math.sqrt((Math.pow(coordinateXOfC - coordinateXOfB, 2)) +
                         (Math.pow(coordinateYOfC - coordinateYOfB, 2)));               // Расчёт длины отрезка ВС: sqrt((x2-x1)^2 + (y2-y1)^2)
        double sumACBC = lengthAC + lengthBC;                                           // Расчёт суммы отрезков АС и ВС: AC + BC
        System.out.println("Длина отрезка АС = " + lengthAC);
        System.out.println("Длина отрезка ВС = " + lengthBC);
        System.out.println("Сумма отрезков АС и ВС равна: " + sumACBC);
    }
}