package com.max.practice;

import java.util.Scanner;

public class Baek_11720 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        int sum = 0;

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
