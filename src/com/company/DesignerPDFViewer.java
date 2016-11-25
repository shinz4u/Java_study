package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mohammedshinoy on 2016-11-24.
 */
public class DesignerPDFViewer {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = 26;
            int h[] = new int[n];
            for(int h_i=0; h_i < n; h_i++){
                h[h_i] = in.nextInt();
            }
            String word = in.next();


            Map<String,Integer> Alphabets = new HashMap<>();

            int alpha_counter = 0;
            for(char alphabet = 'a'; alphabet <= 'z'; alphabet++, alpha_counter++) {
                Alphabets.put(String.valueOf(alphabet), h[alpha_counter]);
            }

            int wordLength = word.length();
            int max_height = 0;

            for(int i =0; i < wordLength; i++){
                int height = Alphabets.get(String.valueOf(word.charAt(i)));
                if (max_height < height){
                    max_height = height;
                }
            }

            int area = max_height * wordLength;
            System.out.println(area);
        }
}
