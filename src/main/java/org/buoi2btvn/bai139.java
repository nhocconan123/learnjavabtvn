package org.buoi2btvn;

public class bai139 {
    public static void main(String[] args) {
        int arr[] = {2200, -2555, -367, 600, -997};
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            if(arr[i] % i == 0){
                sum += i;
            }
        }
        if(sum == arr.length){
            for(int i = arr.length - 1; i >= 0; i--){

            }
        }
    }
}
