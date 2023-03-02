package org.example;

import java.util.Scanner;

public class bai83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 2 so a,b");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        sc.close();
        if(a>=0 && b>=0||a<0 && b<0){
            System.out.println("2 so cung dau"+a+" "+b);
        }else System.out.println("2 so khac dau"+a+" "+b);
    }
}
