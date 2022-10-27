package Begin.begin03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер стороны а прямоугольника: ");
        double sideA = scan.nextDouble();   // Ввод размера стороны a прямоугольника
        System.out.print("Введите размер стороны b прямоугольника: ");
        double sideB = scan.nextDouble();   // Ввод размера стороны b прямоугольника

        System.out.println("Расчёты: ");
        double s = sideA * sideB;           // Расчёт площади прямоугольника
        System.out.println("Площадь прямоугольника S = " + s);
        double p = 2 * (sideA + sideB);     // Расчёт периметра прямоугольника
        System.out.println("Периметр прямоугольника Р = " + p);
    }
}