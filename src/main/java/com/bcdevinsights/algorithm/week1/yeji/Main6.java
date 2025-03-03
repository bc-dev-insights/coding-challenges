package com.bcdevinsights.algorithm.week1.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * OX 퀴즈
 */
public class Main6 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(bf.readLine());

        for(int i = 0; i<n; i++){
          String[] array  = bf.readLine().split("");
          calculate(array);
        }

    }

    private static void calculate(String[] array) {
        int n = array.length;
        int[] sum = new int[n];

        sum[0] = isO(array[0]) ? 1 : 0;

        for(int i=1; i<n; i++){
            String target = array[i];
            if(isO(target)){
                int result = sum[i-1] + 1;
                sum[i] = result;
            }
        }

        int result = Arrays.stream(sum).sum();
        System.out.println(result);
    }

    private static boolean isO(String target) {
        return "O".equals(target);
    }


}
