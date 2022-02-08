package com.max.practice;

import java.util.Scanner;

public class Baek_1546 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        int max = 0;
        int sum = 0;
        double avg = 0.0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }
        avg = 100.0 * sum / max / num;
        System.out.println(avg);
    }
}
