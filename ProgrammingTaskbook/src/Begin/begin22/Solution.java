package Begin.begin22;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение А: ");
        double valueA = scanner.nextDouble();
        System.out.print("Введите значение В: ");
        double valueB = scanner.nextDouble();

        double temp = valueA;                               // Объявление переменной temp и присваивание ей значения переменной temp valueA
        valueA = valueB;
        valueB = temp;
        System.out.println("Значение А равно: " + valueA);
        System.out.println("Значение В равно: " + valueB);
    }
}