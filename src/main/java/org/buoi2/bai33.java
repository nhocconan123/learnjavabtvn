package org.buoi2;

import java.util.Scanner;

public class bai33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao n");
        double n= sc.nextDouble();
        double tong=0;
        double total=0;
        for (int i=1;i<=n;i++)
        {
            tong=Math.pow((double) 2,(double) 1.0/(i+1));
            total+=tong;
        }
        System.out.println(total);
    }
}
