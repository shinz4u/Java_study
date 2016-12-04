package com.company;

/**
 * Created by mohammedshinoy on 2016-11-26.
 */
public class Regexp {


    public static void main(String[] args) {

        String s = "Thelovala";
        String arr[]= s.split("[A-Z]");
        System.out.println(arr.length);
        String[] count = s.split("(?=[A-Z])");

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }

    }
}

