package org.learnjava;

import java.util.Scanner;

public class tonggiaithua {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tong=0;
        int m= sc.nextInt();
        for(int i=1;i<=5;i++)
        {
            m=i*m;
            tong+=m;

        }
        System.out.println(tong);
    }
}
