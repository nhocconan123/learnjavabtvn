package org.learnjava;

import java.util.Calendar;

public class datetimejava {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);

        int nam=cal.get(Calendar.YEAR);
        int thang=cal.get(Calendar.MONTH);
        int ngay=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);
    }
}
