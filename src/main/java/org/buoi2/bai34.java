package org.buoi2;

import java.util.Scanner;

public class bai34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao n");
        double n= sc.nextDouble();
        sc.close();
        double tong=0;
        for (int i=0;i<=n;i++)
        {
            tong=Math.sqrt(i+tong);

        }
        System.out.println(tong);
    }
}
