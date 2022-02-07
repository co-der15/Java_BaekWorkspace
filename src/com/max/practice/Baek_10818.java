package com.max.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_10818 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
    }
}
