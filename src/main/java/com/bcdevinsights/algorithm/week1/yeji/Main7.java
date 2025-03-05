package com.bcdevinsights.algorithm.week1.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 4344. 평균은 넘겠지
 *
 * 입력
 * 5
 * 5 50 50 70 80 100
 * 7 100 95 90 80 70 60 50
 * 3 70 90 80
 * 3 70 90 81
 * 9 100 99 98 97 96 95 94 93 91
 */
public class Main7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i<n; i++){
            String[] array  = bf.readLine().split(" ");
            calculate(array);
        }
    }

    private static void calculate(String[] array){
        int[] classMatesCost = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        int n = classMatesCost[0];
        double average = Arrays.stream(classMatesCost, 1, n+1).summaryStatistics().getAverage();
        long sum = Arrays.stream(classMatesCost, 1, n + 1).filter(cost -> cost > average).count();
        double result = (double) sum / n * 100;
        String format = String.format("%.3f", result);
        System.out.println(format + "%");
    }

}
