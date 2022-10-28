package Begin.begin04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите диаметр окружности d: ");
        double diameter = scan.nextDouble();
        double pi = 3.14;
        double circumference = pi * diameter;       // Расчёт длины окружности: L = pi * d
        System.out.println("Длина окружности L = " + circumference);
    }
}