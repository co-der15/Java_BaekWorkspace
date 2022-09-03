package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_15552 {
    public void method1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            sum = A + B;

            System.out.println(sum);
        }
    }
}
