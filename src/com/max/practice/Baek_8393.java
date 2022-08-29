package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek_8393 {

    public void method1(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
