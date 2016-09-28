package com.company;

/**
 * Created by mohammedshinoy on 2016-09-27.
 */
public class Recursion {

    public int factorial(int n){

        if (n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }

    public int fibonacci(int num){
        if (num == 1 || num == 2){
            return 1;
        }
        else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    public void pascalsTraingle(){

    }
}
