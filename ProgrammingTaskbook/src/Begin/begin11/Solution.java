package Begin.begin11;

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
        double firstNumModulus = Math.abs(firstNum);                                                          // Вычисление модуля первого числа
        double secondNumModulus = Math.abs(secondNum);                                                        // Вычисление модуля второго числа
        System.out.println("Сумма модулей чисел равна: " + (firstNumModulus + secondNumModulus));           // Вычисление суммы модулей чисел
        System.out.println("Разность модулей чисел равна: " + (firstNumModulus - secondNumModulus));        // Вычисление разности модулей чисел
        System.out.println("Произведение модулей чисел равно: " + (firstNumModulus * secondNumModulus));    // Вычисление произведения модулей чисел
        System.out.println("Частное модулей чисел равно: " + (firstNumModulus / secondNumModulus));         // Вычисление частного модулей чисел
    }
}