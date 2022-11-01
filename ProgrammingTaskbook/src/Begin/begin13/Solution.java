package Begin.begin13;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение радиуса первого круга R1 (большего): ");
        double radiusR1 = scanner.nextDouble();
        if (radiusR1 <= 0) {
            System.out.println("Значение радиуса не может быть меньше или равно нулю. Повторите ввод.");
            while (radiusR1 <= 0) {
                System.out.print("Введите значение радиуса первого круга R1 (большего): ");
                radiusR1 = scanner.nextDouble();
            }
        }
        System.out.print("Введите значение радиуса второго круга R2 (меньшего): ");
        double radiusR2 = scanner.nextDouble();
        if (radiusR2 >= radiusR1 || radiusR2 <= 0) {
            System.out.println("Значение радиуса второго круга должно быть меньше, чем у первого и больше нуля. Повторите ввод.");
            while (radiusR2 >= radiusR1 || radiusR2 <=0) {
                System.out.print("Введите значение радиуса второго круга R2 (меньшего): ");
                radiusR2 = scanner.nextDouble();
            }
        }

        System.out.println("Расчёт:");
        double pi = 3.14;                                               // Число pi
        double firstCircleAreaS1 = pi * Math.pow(radiusR1, 2);          // Расчёт площади первого круга: S1 = pi * (R1)^2
        double secondCircleAreaS2 = pi * Math.pow(radiusR2, 2);         // Расчёт площади второго круга: S2 = pi * (R2)^2
        double ringAreaS3 = firstCircleAreaS1 - secondCircleAreaS2;     // Расчёт площади кольца: S3 = S1 - S2
        System.out.println("Площадь круга S1 = " + firstCircleAreaS1);
        System.out.println("Площадь круга S2 = " + secondCircleAreaS2);
        System.out.println("Площадь кольца S3 = " + ringAreaS3);
    }
}