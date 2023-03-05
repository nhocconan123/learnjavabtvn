package org.learnjava;

import java.util.Scanner;

public class baiTapSwitchCase {
    public static void main(String[] args) {
//        viet chuong trinh khung tim kiem : cho nguoi dung nhap vao lua chuong
//                1 tim kiem theo ten
//                2 tim kiem theo tac gia
//                3 tim kiem theo nha suat ban
//                4 tim kiem theo tieu de
//                thoa neu nhap ban phim khon hop le
        Scanner sc= new Scanner(System.in);
        System.out.println("moi nhap phim de chon");
        System.out.println("bam 1: tim kiem theo ten");
        System.out.println("bam 2: tim kiem theo tac gia");
        System.out.println("bam 3: tim kiem theo suat ban");
        System.out.println("bam 4: tim kiem theo tieu de");
        int  so= sc.nextInt();
        switch (so)
        {
            case 1:
                System.out.println(" tim kiem theo ten");
                break;
            case 2:
                System.out.println(" tim kiem theo tac gia");
                break;
            case 3:
                System.out.println(" tim kiem theo ten");
                break;
            case 4:
                System.out.println(" tim kiem theo ten");
                break;
            default:
                System.exit(0);
        }
    }
}
