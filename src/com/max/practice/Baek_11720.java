package com.max.practice;

import java.util.Scanner;

public class Baek_11720 {

    Scanner sc = new Scanner(System.in);

    public void method1(){

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
        // error : InputMismatch
    }
    public void method2(){

        int num = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < num; i++){
            int num2 = sc.nextInt();

            sum += num2;

        }
        System.out.println(sum);
        // error : InputMismatch
    }
    public void method3(){

        int num = sc.nextInt();
        String str = sc.next();

        int sum = 0;

        for(int i = 0; i < num; i++){
            sum += str.charAt(i) - '0';
            // ASCII Code 로 출력이 되기 때문에 0 또는 48을 뺴줘여한다!!
            System.out.println(sum);
        }
        System.out.print(sum);
    }
}

