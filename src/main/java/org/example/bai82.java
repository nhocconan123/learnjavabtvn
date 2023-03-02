package org.example;

import java.util.Scanner;

public class bai82 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao 3 so a,b,c");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("so lon nhat la"+a);
        }else if(b>a&&b>c)
        {
            System.out.println("so lon nhat la "+b);
        }else
            System.out.println("so lon nhat la "+c);
    }
}
