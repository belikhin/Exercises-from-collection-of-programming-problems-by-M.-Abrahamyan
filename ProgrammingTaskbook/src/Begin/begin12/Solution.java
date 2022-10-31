package Begin.begin12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите величину катета а: ");
        double cathetusA = scan.nextDouble();
        if (cathetusA <= 0) {
            System.out.println("Катет не может быть отрицательным. Повторите ввод.");
            while (cathetusA <= 0) {
                System.out.print("Введите величину катета а: ");
                cathetusA = scan.nextDouble();
            }
        }
        System.out.print("Введите величину катета b: ");
        double cathetusB = scan.nextDouble();
        if (cathetusB <= 0) {
            System.out.println("Катет не может быть отрицательным. Повторите ввод.");
            while (cathetusB <= 0) {
                System.out.print("Введите величину катета b: ");
                cathetusB = scan.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double hypotenuse = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));     // Расчёт гипотенузы: c = sqrt(a^2 + b^2)
        double perimeter = cathetusA + cathetusB + hypotenuse;                              // Расчёт периметра: P = a + b + c
        System.out.println("Гипотенуза прямоугольного треугольника c = " + hypotenuse);
        System.out.println("Периметр прямоугольного треугольника Р = " + perimeter);
    }
}