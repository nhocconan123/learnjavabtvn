package org.buoi2btvn;

public class bai139 {
    public static void main(String[] args) {
        int arr[] = {28, 4, -367, 600, -997};
        for (int i=0;i<arr.length;i++)
        {
            if(sohoanthien(arr[i]));
            System.out.println("so"+arr[i]+"la so hoan thien");
        }
    }
    public static boolean sohoanthien(int number)
    {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

