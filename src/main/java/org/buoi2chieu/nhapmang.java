package org.buoi2chieu;

import java.util.Random;
import java.util.Scanner;

public class nhapmang {
    public static void main(String[] args) {
        //tao 1 mang gom n phan tu nhap gia tri cho mang va in ra
        Scanner sc =new Scanner(System.in);
        int n=0;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        Random random= new Random(1000);
        //tao mang
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=random.nextInt();
        }
        //xuat mang
        for (int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \t",i,arr[i]);
        }
    }
}
