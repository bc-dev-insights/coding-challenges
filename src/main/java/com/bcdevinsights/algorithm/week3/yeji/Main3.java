package com.bcdevinsights.algorithm.week3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 2750. 수 정렬하기
 */
public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new PriorityQueue<>();
        int s = Integer.parseInt(br.readLine());

        for(int i=0;i<s;i++){
            queue.offer(Integer.parseInt(br.readLine()));
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
