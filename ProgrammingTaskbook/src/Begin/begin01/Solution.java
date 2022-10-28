package Begin.begin01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер стороны квадрата: ");
        Double squareSide = scan.nextDouble();          // Ввод размера стороны квадрата
        Double perimeter = 4 * squareSide;  // Вычисление периметра квадрата
        System.out.println("Периметр квадрата равен " + perimeter);
    }
}