package Begin.begin05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину ребра куба: ");
        double cubeEdgeLength = scan.nextDouble();
        System.out.println("Расчёты:");
        double cubeVolume = Math.pow(cubeEdgeLength, 3);            // Расчёт объёма куба: V = a^3
        System.out.println("Объём куба V = " + cubeVolume);
        double cubeSurfaceArea = 6 * Math.pow(cubeEdgeLength, 2);   // Расчёт площади поверхности куба: S = 6 * a^2
        System.out.println("Площадь поверхности куба S = " + cubeSurfaceArea);
    }
}