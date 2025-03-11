package com.bcdevinsights.algorithm.week2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10872. 팩토리얼
 *
 * 문제
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 */
public class Main5 {

    public static int result = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        factorial(n);
        System.out.println(result);
    }

    private static void factorial(int n) {
        if(n<=1){
            return;
        }

        result*=n;
        factorial(n-1);
    }

}
