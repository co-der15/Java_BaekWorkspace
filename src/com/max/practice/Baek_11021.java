package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_11021 {
    public void method1() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println("Case #" + i + ": " + (A+B));
        }
    }

    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            System.out.println("Case #" + i + ": " +
                    (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }
    }

    public void method3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                    .append('\n');
        }
        System.out.println(sb);
    }
}
