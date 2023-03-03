package org.buoi2chieu;

import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        //tao 1 mang ngau nhien gom n phan tu tu 0-9999
        //in ram mang vua tao
        // in ra so lon nhat be nhat trong mang
        // tinh trung binh cong tat ca cac gia tri trong mang
        Scanner sc =new Scanner(System.in);
        int n=0;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        Random random= new Random(1);
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
        //tim sap xep giam dan
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(arr[i]< arr[j])
                {
                    int tam=0;
                    tam=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tam;
                }
            }
        }
        //max
        System.out.println("");
        System.out.println("max"+arr[0]);
        System.out.println("min"+arr[n-1]);

        // tinh trung binh cong
        int tong=0;
        for (int i=0 ;i<n;i++)
        {
            tong=tong+arr[i];
        }
        System.out.println("trung binh cong"+(double)tong/n);

    }
}
