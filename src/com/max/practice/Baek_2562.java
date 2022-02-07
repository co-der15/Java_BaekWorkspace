package com.max.practice;

import java.util.Scanner;

public class Baek_2562 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int place = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
                place = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(place);
    }
}
