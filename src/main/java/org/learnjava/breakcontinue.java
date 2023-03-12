package org.learnjava;

public class breakcontinue {
    public static void main(String[] args) {
        int tong=0;
        for (int i = 0; i <=5 ; i++) {
            if(i==3)
                continue;
            else
                tong+=i;
        }
        System.out.println("tong= "+tong);
    }
}
