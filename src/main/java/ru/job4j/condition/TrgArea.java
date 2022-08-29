package ru.job4j.condition;

public class TrgArea {
        public static double area(double a, double b, double c) {
            double p = (a + b + c) / 2;
            double s1 = p * (p - a) * (p - b) * (p - c);
            double rsl = Math.sqrt(s1);
            return rsl;
        }

        public static void main(String[] args) {
            double a = 2;
            double b = 2;
            double c = 2;
            double rsl = TrgArea.area(a, b, c);
            System.out.println("area (2, 2, 2) = " + rsl);
            System.out.println("Площадь треуголника со сторонами (" + a + ", " + b + ", " + c + ") = равна " + rsl);
        }
}
