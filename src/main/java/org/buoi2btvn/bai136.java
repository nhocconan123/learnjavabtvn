package org.buoi2btvn;

import java.util.Random;
import java.util.Scanner;

public class bai136 {
    public static void main(String[] args) {
        // tim so chan cuoi cung trong mang 1 chieu cac so nguyen. neu mang khong co gia tri thi tra ve -1
        Scanner sc =new Scanner(System.in);


        System.out.println("nhap so luong phan tu");
        int n=0;
        do{
            n = sc.nextInt();
        }
        while(n<0);
        int[] arr= new int[n];

        Random random= new Random();
        //tao mang
        for (int i = 0; i < n; i++) {
            // 0 -> 999
            arr[i] = random.nextInt(1000);
            System.out.println(arr[i]);
        }
        // tim kiem phan tu chan cuoi cung trong mang
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]%2==0)
            {
                System.out.println("phan tu chan cuoi cung trong mang la"+arr[i]);
                break;
            }
        }

    }
}
