package org.example;

import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static String calculate(double a, double b, double c) {
        DecimalFormat format=new DecimalFormat("#.#");

        double discriminant = b * b - 4 * a * c;

        double x1, x2;
        if (!Double.isNaN(discriminant) && discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (Double.isNaN(x1) || Double.isNaN(x2)) return "Ошибка";
            if (x1 == 0.0 || x1 == -0.0) x1 = 0;
            if (x2 == 0.0 || x2 == -0.0) x2 = 0;



            return "x1 = " + format.format(x1) + "; " + "x2 = " + format.format(x2);
        } else {
            return "Ошибка";
        }
    }

}