package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_10951 {
    public void method1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append('\n');
        }
        System.out.println(sb);
    }

    public void method2(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            // hasNextInt : return true if the next scanner's input is a Int value
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
