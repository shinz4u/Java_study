package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by mohammedshinoy on 2016-09-26.
 */
public class Solution {

    private static String[] stacky;
    private static int top = -1;

    public static void push(String bracket){
        if (isEmpty()){

        }
        stacky[top+1] = bracket;
        top++;

    }

    public static String pop(){
        if (isEmpty()){
            return "Empty";
        }
        String temp = stacky[top];
        stacky[top] = null;
        top--;
        return temp;
    }

    public static boolean isEmpty(){
        return (top == -1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String letter;
        for(int a0 = 0; a0 < t; a0++){
            stacky = new String[1000];
            top = -1;
            String s = in.next();
            boolean flag = true;
            boolean flag2 = true;

            innerloop: for (int i = (s.length()-1); i > -1 ; i--){

                if (i == 0){
                    flag = true;
                }else {
                    flag = false;
                }

                if ( (s.charAt(i) == ')') || (s.charAt(i) == '}') || (s.charAt(i) == ']') ){
                    push(String.valueOf(s.charAt(i)));


                }
                else{

                    letter = String.valueOf(s.charAt(i));
                    if (letter.equals("(")){
                        if (!pop().equals(")")){
                            //System.out.println("NO");
                            flag2 = false ;
                            break innerloop;
                        }
                    }
                    else if (letter.equals("{")){
                        if (!pop().equals("}")){
                            //System.out.println("NO");
                            flag2 = false;
                            break innerloop;
                        }
                    }
                    else if (letter.equals("[")){
                        if (!pop().equals("]")){
                            //System.out.println("NO");
                            flag2 = false;
                            break innerloop;
                        }
                    }
                }
            }
            if (isEmpty() && flag && flag2) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
