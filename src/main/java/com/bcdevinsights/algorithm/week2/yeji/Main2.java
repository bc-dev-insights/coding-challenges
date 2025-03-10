package com.bcdevinsights.algorithm.week2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1152. 단어의 개수
 */
public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(s.trim().length() == 0 ? 0 : s.trim().split(" ").length);
    }
}
