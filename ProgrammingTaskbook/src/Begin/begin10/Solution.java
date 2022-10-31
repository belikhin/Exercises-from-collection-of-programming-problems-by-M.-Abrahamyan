package Begin.begin10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое ненулевое число: ");
        double firstNum = scan.nextDouble();
        if (firstNum == 0) {
            System.out.println("Вы ввели число, равное нулю. Повторите попытку.");
            while (firstNum == 0) {
                System.out.print("Введите первое ненулевое число: ");
                firstNum = scan.nextDouble();
            }
        }
        System.out.print("Введите второе ненулевое число: ");
        double secondNum = scan.nextDouble();
        if (secondNum == 0) {
            System.out.println("Вы ввели число, равное нулю. Повторите попытку.");
            while (secondNum == 0) {
                System.out.print("Введите второе ненулевое число: ");
                secondNum = scan.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double firstNumSquare = Math.pow(firstNum, 2);                                                      // Вычисление квадрата первого числа
        double secondNumSquare = Math.pow(secondNum, 2);                                                    // Вычисление квадрата второго числа
        System.out.println("Сумма квадратов чисел равна: " + (firstNumSquare + secondNumSquare));           // Вычисление суммы квадратов
        System.out.println("Разность квадратов чисел равна: " + (firstNumSquare - secondNumSquare));        // Вычисление разности квадратов
        System.out.println("Произведение квадратов чисел равно: " + (firstNumSquare * secondNumSquare));    // Вычисление произведения квадратов
        System.out.println("Частное квадратов чисел равно: " + (firstNumSquare / secondNumSquare));         // Вычисление частного квадратов
    }
}