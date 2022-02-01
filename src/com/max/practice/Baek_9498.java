package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek_9498 {
    public void method1(){
        Scanner sc =new Scanner(System.in);

        int score = sc.nextInt();

        if(score <= 100){
            System.out.println("A");
        }else if(score < 90){
            System.out.println("B");
        } else if(score < 80 ){
            System.out.println("C");
        } else if(score < 70){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        if(score <= 100){
            System.out.println("A");
        }else if(score < 90){
            System.out.println("B");
        }else if(score < 80){
            System.out.println("C");
        }else if(score < 70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}
