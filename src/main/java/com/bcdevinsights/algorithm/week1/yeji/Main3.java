package com.bcdevinsights.algorithm.week1.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2588. 곱셈
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 472
 * 385
 *
 * 출력
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 * 2360
 * 3776
 * 1416
 * 181720
 */
public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String input = bf.readLine();
        String input2 = bf.readLine();

        calculate(input, input2);
    }

    private static void calculate(String input, String input2) {
        int a = Integer.parseInt(input);
        int b = Integer.parseInt(input2);

        int b1 = b % 10;
        int b2 = (b % 100) / 10;
        int b3 = b / 100;

        System.out.println(a * b1);
        System.out.println(a * b2);
        System.out.println(a * b3);
        System.out.println(a * b);
    }
}
