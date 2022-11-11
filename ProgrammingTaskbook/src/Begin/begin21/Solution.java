package Begin.begin21;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x1 первой вершины треугольника: ");
        double triangleApexX1 = scanner.nextDouble();
        System.out.print("Введите координату y1 первой вершины треугольника: ");
        double triangleApexY1 = scanner.nextDouble();
        System.out.print("Введите координату x2 второй вершины треугольника: ");
        double triangleApexX2 = scanner.nextDouble();
        System.out.print("Введите координату y2 второй вершины треугольника: ");
        double triangleApexY2 = scanner.nextDouble();
        System.out.print("Введите координату x3 третьей вершины треугольника: ");
        double triangleApexX3 = scanner.nextDouble();
        System.out.print("Введите координату y3 третьей вершины треугольника: ");
        double triangleApexY3 = scanner.nextDouble();

        System.out.println("Расчёт:");
        double lengthA = Math.sqrt(Math.pow(triangleApexX2 - triangleApexX1, 2) + Math.pow(triangleApexY2 - triangleApexY1, 2));                // Расчёт расстояния между вершинами: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double lengthB = Math.sqrt(Math.pow(triangleApexX3 - triangleApexX2, 2) + Math.pow(triangleApexY3 - triangleApexY2, 2));                // Расчёт расстояния между вершинами: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double lengthC = Math.sqrt(Math.pow(triangleApexX3 - triangleApexX1, 2) + Math.pow(triangleApexY3 - triangleApexY1, 2));                // Расчёт расстояния между вершинами: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double perimeter = lengthA + lengthB + lengthC;                                                                                         // Расчёт периметра: P = a + b + c
        double semiperimeter = perimeter / 2;                                                                                                   // Расчёт полупериметра: P = (a + b + c) / 2
        double triangleArea = Math.sqrt(semiperimeter * (semiperimeter - lengthA) * (semiperimeter - lengthB) * (semiperimeter - lengthC));     // Расчёт площади треугольника: S = sqrt(p * (p - a) * (p - b) * (p - c))
        System.out.println("Периметр треугольника Р = " + perimeter);
        System.out.println("Площадь треугольника S = " + triangleArea);
    }
}