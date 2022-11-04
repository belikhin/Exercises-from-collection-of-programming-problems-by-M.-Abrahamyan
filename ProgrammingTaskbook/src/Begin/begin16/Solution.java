package Begin.begin16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую координату х1: ");
        double firstX1 = scanner.nextDouble();
        System.out.print("Введите вторую координату х2: ");
        double secondX2 = scanner.nextDouble();

        System.out.println("Расчёт:");
        double interval = Math.abs(firstX1) + Math.abs(secondX2);// Рассчёт модуля чисел: |x2 - x1| или |x2| + |x1|
        System.out.println("Расстояние между двумя точками равно: " + interval);
    }
}