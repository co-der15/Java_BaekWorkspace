package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_10952 {
    public void method1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){

            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0){
                break;
            }
            sb.append(A+B).append('\n');
        }
        System.out.println(sb);
    }

    public void method2(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A == 0 && B == 0){
                break;
            }
            System.out.println(A+B);
        }
    }
}
