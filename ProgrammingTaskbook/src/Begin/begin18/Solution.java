package Begin.begin18;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение точки А: ");
        double pointA = scanner.nextDouble();
        System.out.print("Введите значение точки B: ");
        double pointB = scanner.nextDouble();
        System.out.print("Введите значение точки C, которая расположена между точками А и В: ");
        double pointC = scanner.nextDouble();
        if(pointC <= pointA || pointC >= pointB) {
            System.out.println("Значение точки C должно быть больше значения А и меньше значения В. Повторите ввод.");
            while (pointC <= pointA || pointC >= pointB) {
                System.out.print("Введите значение точки C, которая расположена между точками А и В: ");
                pointC = scanner.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double lengthAC = Math.abs(pointA - pointC);                                                 //Расчёт длины отрезка АС: |A - C|
        double lengthBC = Math.abs(pointB - pointC);                                                 //Расчёт длины отрезка BC: |B - C|
        double multiplicationACBC = lengthAC * lengthBC;                                             //Расчёт произведения длин отрезков АС и ВС: |A - C| * |B - C|
        System.out.println("Произведение длин отрезков АС и ВС составляет: " + multiplicationACBC);
    }
}