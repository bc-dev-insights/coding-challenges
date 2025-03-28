package com.bcdevinsights.algorithm.week4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10819. 차이를 최대로
 *
 * 문제
 * N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
 * |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
 *
 * 입력
 * 첫째 줄에 N (3 ≤ N ≤ 8)이 주어진다. 둘째 줄에는 배열 A에 들어있는 정수가 주어진다. 배열에 들어있는 정수는 -100보다 크거나 같고, 100보다 작거나 같다.
 * 6
 * 20 1 15 8 4 10
 *
 * 출력
 * 첫째 줄에 배열에 들어있는 수의 순서를 적절히 바꿔서 얻을 수 있는 식의 최댓값을 출력한다.
 * 62
 */
public class Main2 {

    public static int max = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] visited = new boolean[n];
        int[] output = new int[n];
        permutation(arr, output, visited, 0, n, n);
        System.out.println(max);

    }

    private static void permutation(int[] arr, int[] output, boolean[] visited, int i, int n, int n1) {
        if(i == n){
            int sum = 0;
            for(int j=0;j<n-1;j++){
                sum += Math.abs(output[j] - output[j+1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for(int j=0;j<n;j++){
            if(!visited[j]){
                visited[j] = true;
                output[i] = arr[j];
                permutation(arr, output, visited, i+1, n, n1);
                visited[j] = false;
            }
        }
    }

}
