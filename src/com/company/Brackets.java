package com.company;

import java.util.*;
import java.util.Stack;


public class Brackets {
    public static boolean isBalanced(String s) {
        Stack<String> stacky = new Stack();

        int i;
        for(i = 0; i < (s.length()); i++){

            if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '[')){
                stacky.push(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i) == ')'){
                try{
                    System.out.println(stacky.peek());
                    if(!stacky.pop().equals("(")){
                        System.out.print(" it not (");
                        return false;
                    }
                }
                catch(EmptyStackException e){
                    System.out.print(" it empty at (");
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                try{
                    System.out.println(stacky.peek());
                    if(!stacky.pop().equals("[")){
                        System.out.print(" it not [");
                        return false;
                    }
                }
                catch(EmptyStackException e){
                    System.out.print("it empty at [");
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                try{
                    if(!stacky.pop().equals("{")){
                        System.out.println(stacky.peek());
                        System.out.println(" it not {");
                        return false;
                    }
                }
                catch(EmptyStackException e){
                    System.out.print(" it empty at {");
                    return false;
                }
            }
        }
        if(!stacky.empty()){
            System.out.print(" stack not empty");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
