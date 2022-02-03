package com.max.practice;

import java.util.Scanner;

public class Baek_2739 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
