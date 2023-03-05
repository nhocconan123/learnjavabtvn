package org.buoi2btvn;

import java.util.Random;
import java.util.Scanner;

public class bai134 {
    public static void main(String[] args) {
        // viet ham tim gia tri lon nhat cua mang mot chieu so thuc
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
        // Cần tìm vị trí đầu tiên đạt giá trị max
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.printf("max %d \n", max);
    }
}
