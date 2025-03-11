package com.bcdevinsights.algorithm.week2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1978. 소수 찾기
 *
 * 문제
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *
 * 출력
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
public class Main4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for(int i=0; i<n; i++){
            int x = array[i];
            if(x == 2 || x > 1 && isSosu(x)){
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isSosu(int x) {
        for(int i=2; i <x; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
