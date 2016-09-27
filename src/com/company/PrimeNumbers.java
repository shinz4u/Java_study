package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mohammedshinoy on 2016-09-26.
 */
public class PrimeNumbers{


    public boolean checkPrime(int N) {

        int root_N = (int) Math.sqrt(N);

        if (N <= 1) {
            return false;
        }
        else if(N == 2 || N == 3){
            return true;
        }
        else if ((N % 2 == 0) || (N % 3 == 0)) {
            return false;
        }
        for (int i = 5; i < root_N; i+=2) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }


    public List<Integer> getallprime(int N){
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < N ; i ++){
            if(checkPrime(i)){
                array.add(i);
            }

        }
        return array;
    }

    public void printSumofPrime(int N){
        List<Integer> array;
        long sum = 0;
        array = getallprime(N);
        for (Integer number : array){
            sum += number;
        }
        System.out.println(sum);
    }

    public void printAllPrime(int N){
        List<Integer> array;
        array = getallprime(N);
        for (Integer number : array){
            System.out.println(number);
        }

    }


}
