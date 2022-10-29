package Begin.begin06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину ребра а: ");
        double edgeLengthA = scan.nextDouble();
        System.out.print("Введите длину ребра b: ");
        double edgeLengthB = scan.nextDouble();
        System.out.print("Введите длину ребра с: ");
        double edgeLengthC = scan.nextDouble();

        System.out.println("Расчёты:");
        double parallelepipedVolume = edgeLengthA * edgeLengthB * edgeLengthC;                                                           // Расчёт объёма параллелепипеда: V = a * b * c
        System.out.println("Объём параллелепипеда V = " + parallelepipedVolume);
        double parallelepipedSurfaceArea = 2 * (edgeLengthA * edgeLengthB + edgeLengthB * edgeLengthC + edgeLengthA * edgeLengthC);     // Расчёт площади поверхности параллелепипеда: S = 2 * (a * b + b * c + a * c)
        System.out.println("Площадь поверхности параллелепипеда S = " + parallelepipedSurfaceArea);
    }
}