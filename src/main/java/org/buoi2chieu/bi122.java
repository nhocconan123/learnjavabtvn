package org.buoi2chieu;

import java.util.Random;
import java.util.Scanner;

public class bi122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        int n = sc.nextInt();
        int[] arr= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = random.nextInt(10000);
//        }
        for(int i=0;i<n;i++)
        {
            arr[i]=random.nextInt(100);

        }
        for (int value:arr)
        {
            System.out.print(value + "\t");
        }
        int  max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("max : "+max);
    }
}
