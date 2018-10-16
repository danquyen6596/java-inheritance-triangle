package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.println("Input a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.println("Input color: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(color, true, a, b, c);

        System.out.println(triangle.toString());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Parameter: " + triangle.getParameter());

    }
}
