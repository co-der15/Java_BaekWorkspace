package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek_14681 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > 0){
            if(num2 > 0){
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else
            if(num2 > 0){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
    }
    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        if(num1 > 0){
            if(num2 > 0){
                System.out.println("1");
            }else {
                System.out.println("4");
            }
        }else{
            if(num2 < 0){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
    }
}
