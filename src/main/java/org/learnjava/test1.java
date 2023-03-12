package org.learnjava;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //viet truong trinh tinh tong cac so tu 1 den n, bo qua cong tong voi so 3
        int n;
        int tong=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("moi bạn nhap vao so nguyen n");
        n=sc.nextInt();
        if(n%2!=0)
        {
            for (int i = 0; i <= n; i++) {
               if(i==3)
                   continue;
               else
                tong+=i;
            }

        }
    }
}
