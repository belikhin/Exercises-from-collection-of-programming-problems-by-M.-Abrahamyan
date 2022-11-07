package Begin.begin19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату х1 первой вершины прямоугольника: ");
        double coordinateX1 = scanner.nextDouble();
        System.out.print("Введите координату y1 первой вершины прямоугольника: ");
        double coordinateY1 = scanner.nextDouble();
        System.out.print("Введите координату х2 второй вершины прямоугольника: ");
        double coordinateX2 = scanner.nextDouble();
        System.out.print("Введите координату y2 второй вершины прямоугольника: ");
        double coordinateY2 = scanner.nextDouble();

        System.out.println("Расчёт:");
        double lengthOfFirstSide = Math.abs(coordinateX2 - coordinateX1);
        double lengthOfSecondSide = Math.abs(coordinateY2 - coordinateY1);
        double perimeter = 2 * (lengthOfFirstSide + lengthOfSecondSide);
        double area = lengthOfFirstSide * lengthOfSecondSide;
        System.out.print("Периметр прямоугольника составляет: " + perimeter);
        System.out.print("Площадь прямоугольника составляет: " + area);
    }
}