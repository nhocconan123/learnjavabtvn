package org.buoi2chieu;

public class songuyento {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8};
        int dem=0;
        for(int i=0;i<arr.length;i++)
        {
            if (nguyento(arr[i])) {
                dem++;

                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("co tat ca "+dem+" so nguyen to");
    }
    public static boolean nguyento(int x)
    {
        if(x<2){
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
