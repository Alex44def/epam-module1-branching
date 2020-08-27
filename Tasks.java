package ru.epam.jonline.module1.branching;

import static java.lang.Math.*;

public class Tasks {

// 	Даны два угла треугольника (в градусах).
// 	Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным

	public static void firstTask(double x, double y) {
		System.out.print("Answer firstTask: ");

		double angle = (180 - x - y);

		if (angle > 0) {
			System.out.printf("Треугольник существует. Третий угол равен %.2f градусов %n", angle);
			if (angle == 90) {
				System.out.printf("Треугольник прямоугольный. %n");
			}
		} else {
			System.out.printf("Треугольник не существует. %n");
		}
	}

// 	Найти max{min(a, b), min(c, d)}.

	public static void secondTask(int a, int b, int c, int d) {
		System.out.println("Answer secondTask: ");

		int z;
		
		z = max(min(a, b), min(c, d));

		System.out.println(z);
	}

//	Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

	public static void thirdTask(double x1, double y1, double x2, double y2, double x3, double y3) {
		System.out.print("Answer thirdTask: ");
		
		if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
			System.out.println("Точки на одной прямой");
		} else {
			System.out.println("Точки не на одной прямой");
		}
	}

//  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие

	public static void fourthTask(double a, double b, double x, double y, double z) {
		System.out.println("Answer fourthTask: ");

		if ((a > x || a > y || a > z) && (b > x || b > y || b > z)) {
			System.out.println("Кирпич пройдет в отверстие");
		} else {
			System.out.println("Кирпич не пройдет в отверстие");
		}
	}

//  Вычислить значение функции

	public static void fifthTask(int x) {
		System.out.println("Answer fifthTask: ");
		
		double z;
		
		if (x > 3) {
			z = pow(x, 2) - 3 * x + 9;
		} else {
			z = 1 / pow(x, 3) + 6;
		}
		
		System.out.println(z);
	}

}
