package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y) {
            return x+y;
        }

        public int product(int x, int y, int z) {
        return x+y+z;
        }

        public double product(double x, double y) {
            return x+y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int first = p.product(1,2);
//        System.out.println(first);
        int second = p.product(1,2,3);
//        System.out.println(second);
        double third = p.product(1.00,2.00);
//        System.out.println(third);
    }
}