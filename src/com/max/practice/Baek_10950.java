package com.max.practice;

import java.util.Scanner;

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
}
