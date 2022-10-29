package Begin.begin08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число а: ");
        double first = scan.nextDouble();
        System.out.print("Введите число b: ");
        double second = scan.nextDouble();

        System.out.println("Расчёт:");
        double average = (first + second) / 2;      // Расчёт среднего арифметического: (a + b) / 2
        System.out.println("Среднее арифметическое чисел " + first + " и " + second + " равно: " + average);
    }
}