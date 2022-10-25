package Begin.begin01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSides = 4;
        Double squareSide = scan.nextDouble();          // Ввод размера стороны квадрата
        Double perimeter = numberOfSides * squareSide;  // Вычисление периметра квадрата
        System.out.println(perimeter);
    }
}