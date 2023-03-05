package org.buoi2btvn;

import java.util.Random;
import java.util.Scanner;

public class bai135 {
    public static void main(String[] args) {
        // tim gia tri duong dau tien trong mang 1 chieu cac so thuc
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so luong mang");
        int n=0;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        int[] arr= new int[n];
        Random random= new Random();
        //tao mang
        for (int i = 0; i < n; i++) {
            // 0 -> 999
            arr[i] = random.nextInt(1000);
            System.out.println(arr[i]);
        }
        int i=0;
        for(i =0;i<arr.length;i++)
        {
//            System.out.println("mang vua nha"+arr[i]);
            if(arr[i]>=0)
            {
                System.out.println("so duong dau tien trong mang"+arr[i]);
                break;
            }else
            {

                System.out.println("khong co phan tu nao thoa manx");
            }
        }
    }
}
