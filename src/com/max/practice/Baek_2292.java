package com.max.practice;

import java.util.Scanner;

public class Baek_2292 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1; // 최소 루트
        int range = 2; // 최솟값 기준준

       if(N == 1){
            System.out.println(1);
        } else {
            while(range <= N){
                range = range + ( 6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }

    }
}
