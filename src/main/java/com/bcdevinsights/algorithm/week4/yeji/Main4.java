package com.bcdevinsights.algorithm.week4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2309. 일곱 난쟁이
 * 문제
 * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 *
 * 입력
 * 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 *
 * 출력
 * 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
 */
public class Main4 {

    public static int[] result = new int[7];

    // 2 명을 뺸 합이 100이 나오는지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> nanjang = new ArrayList<>();
        String line;

        for(int i=0; i<9; i++){
            line = br.readLine();
            nanjang.add(line);
        }
        combination(nanjang, new boolean[nanjang.size()], 0, 0, new int[7]);
        Arrays.stream(result).sorted().forEach(System.out::println);
    }

    /**
     * 조합
     * @param nanjang
     * @param booleans
     * @param i
     * @param i1
     * @param ints
     */
    private static void combination(List<String> nanjang, boolean[] booleans, int i, int i1, int[] ints) {

        if(i1 == 7){
            int sum = 0;
            for(int j=0;j<7;j++){
                sum += ints[j];
            }
            if(sum == 100){
                System.arraycopy(ints, 0, result, 0, 7);
            }
            return;
        }

        for(int j=i;j<nanjang.size();j++){
            if(!booleans[j]){
                booleans[j] = true;
                ints[i1] = Integer.parseInt(nanjang.get(j));
                combination(nanjang, booleans, j, i1+1, ints);
                booleans[j] = false;
            }
        }
    }
}
