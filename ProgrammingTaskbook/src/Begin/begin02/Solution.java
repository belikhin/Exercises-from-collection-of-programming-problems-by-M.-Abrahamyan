package Begin.begin02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер стороны квадрата: ");
        double squareSide = scan.nextDouble();   // Ввод размера стороны квадрата
        double square = Math.pow(squareSide, 2); // Вычисление площади квадрата
        System.out.println("Площадь квадрата равна " + square);
    }
}