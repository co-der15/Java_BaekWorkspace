package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_2480 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = A;

        if(A == B && B == C){
            System.out.println(10000 + (1000 * A));
        } else if(A != B && B != C && A != C){
            if(max < B){
                max = B;
            }
            if(max < C){
                max = C;
            }
            System.out.println(100 * max);
        } else {
            if(A != B){
                System.out.println(1000 + (100 * C));
            } else if(A != C){
                System.out.println(1000 + (100 * B));
            }
        }
    }

    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int max = A;

        if(A == B && B == C){
            System.out.println(10000 + (1000 * A));
        } else if(A != B && B != C && A != C){
            if(max < B){
                max = B;
            }
            if(max < C){
                max = C;
            }
            System.out.println(100 * max);
        } else {
            if(A != B){
                System.out.println(1000 + (100 * C));
            } else if(A != C){
                System.out.println(1000 + (100 * B));
            }
        }

    }
}
