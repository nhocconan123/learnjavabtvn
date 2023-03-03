package org.buoi2chieu;

import java.util.Random;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        //.Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ
        //hơn 2004 hay không?
        Scanner sc =new Scanner(System.in);
        int n=0;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        Random random= new Random();
        //tao mang
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=random.nextInt(1000);
        }
        //xuat mang
        for (int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \t",i,arr[i]);
        }



    }
}
