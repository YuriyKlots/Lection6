package mymath;

import static java.lang.Math.abs;
import static java.lang.Math.tan;

public class MyMath {
    /*    Створити клас MyMath. В ньому створити 2-3 константи і 3-4 статичні методи.
        Константи і методи повинні бути математичного характеру.
        Визвати константи і статичні методи в методі main
     */
    public static final double PI = 3.1415;
    public static final double E = 1e-10;

    /**
     * Обчислення суми ряду 1/n з точністю до epsilon. Якщо вхідна точність нижча стандартної Е - до стандартної
     *
     * @param epsilon - точність обчислень, якщо менше стандартної - ігнорується.
     * @return сума ряду
     */
    public static double summRow(double epsilon) {
        epsilon = (epsilon < E) ? epsilon : E;
        double summ = 0;
        double num = 1;
        double element;
        while ((element = (1 / num)) > epsilon) {
            summ += element;
            num++;
        }
        System.out.printf("n = %8.0f, summ = %10.5f, element = %2.10f\n", num, summ, element);
        return summ;
    }

    /**
     * Обраховує корінь квадратний від аргументу з точністю Е
     *
     * @param x - число, з якого отримується корінь
     * @return -1 для від'ємних чисел, інакше - корінь квадратний з числа
     */
    public static double sqrt(double x) {
        if (x < 0) return -1;
        double a = x / 2;// початкове значення рівне половині
        while (abs(a * a - x) > E) {
            a = (a + x / a) / 2;
        }
        return a;
    }


    /**
     * Обраховує периметр правильного багатокутника
     *
     * @param count  - кількість сторін
     * @param length - довжина сторони
     * @return - периметр
     */
    public static double perimetr(int count, double length) {
        return count * length;
    }


    /**
     * Обраховує довжину кола
     *
     * @param radius - радіус
     * @return - довжина кола
     */
    public static double perimetr(double radius) {
        return 2 * radius * PI;
    }

    public static void main(String[] args) {

        System.out.println(summRow(0.0001));
        System.out.println("--------");
        System.out.println("Sqrt(5) = " + sqrt(5));
        System.out.println("--------");
        System.out.println("perimetr(5) = " + perimetr(5));
        System.out.println("--------");
        System.out.println("perimetr(5,5) = " + perimetr(5, 5));

    }

}
