package com.company;

public class Main {

    public static void multiAdd (double a, double b, double c, double d, double e, double f, double exSum){
        if (a >= 0) {
            double simple = (a * b + c);
            double sin = Math.sin(Math.PI / d) + (Math.cos(Math.PI / d) / b);
            double log = Math.log(e) + Math.log(f);
            System.out.printf("%.1f * %.1f + %.1f = %.1f \n", a, b, c, simple);
            System.out.printf("sin(π/%.1f) + cos(π/%.1f)/%.1f = %.2f \n", d, d, b, sin);
            System.out.printf("log(%.1f) + log(%.1f) = %.2f \n", e, d, log);
        } else if (exSum > 0 || a < 0) {
            double result = exSum * Math.exp(-exSum) + Math.sqrt(1 - Math.exp(-exSum));
            System.out.printf("e to a power of %.2f = %.2f",exSum, result);
        }
    }

    public static void expSum (double x){
        if (x > 0){
            double a = - 1.0;
            multiAdd(a, a, a, a, a, a, x);
        }
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = 4.0;
        double e = 10.0;
        double f = 20.0;
        double exSum = 2.0;

        multiAdd(a, b, c, d, e, f, exSum);
        expSum(exSum);
    }
}
