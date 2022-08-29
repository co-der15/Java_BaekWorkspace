package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_10950 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }
        for(int k : arr){
            System.out.println(k);
            // for-each문
            // arr들을 반복문이 작동할 때마다 하나씩 꺼내서 K변수에 담도록하는 것
        }
    }

    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // StringBuffer와 같이 데이터를 임시로 저장하고 그안에서 추가, 수정, 삭제 작업을
        // 할 수 있도록 설계되어 있음
        // StringBuffer와 차이점은 StringBuffer는 멀티스레드 사용 가능 StringBuilder는
        // 단일스레드 환경에서 사용 가능

        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }
}
