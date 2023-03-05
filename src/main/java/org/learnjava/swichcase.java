package org.learnjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class swichcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao 1 so nguyen");
        int a= sc.nextInt();
        int div= a%2;
        switch (div)
        {
            case 0:
                System.out.println("la so chan");
                break;
            default:
                System.out.println("la so le");
                break;
        }
    }
}
