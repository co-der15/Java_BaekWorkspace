package com.max.practice;

import java.util.Scanner;

public class Baek_1110 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;
        int temp = num;

        while(true){
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            cnt++;

            if(temp == num ){
                break;
            }
        }
        System.out.println(cnt);
    }
}
