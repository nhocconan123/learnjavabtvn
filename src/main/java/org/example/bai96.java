package org.example;

import java.util.Scanner;

public class bai96 {
    public static void main(String[] args) {
        double x,y;
        System.out.print("Nhap x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        sc.close();
        if(x >= 5) {
            y = 2*Math.pow(x, 2) + 5*x +9;
            System.out.printf("Gia tri cua ham so la: %.1f", y);
        }else {
            y = (-2)*Math.pow(x, 2) + 4*x -9;
            System.out.printf("Gia tri cua ham so la: %.1f", y);
        }
    }
}
