package org.buoi2;

import java.util.Scanner;

public class bai33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao n");
        double n= sc.nextDouble();
        sc.close();
        double tong=0;
        double total=0;
        for (int i=1;i<=n;i++)
        {
            tong=Math.sqrt(tong+2);

        }
        System.out.println(tong);
    }
}
