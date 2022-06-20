package com.max.practice;

import java.util.Scanner;

public class Baek_4344 {
    Scanner sc = new Scanner(System.in);

    public void method1(){

        int[] arr;
        int tCase = sc.nextInt(); //test cass value

        for(int i = 0; i < tCase; i++){
            int student = sc.nextInt();
            arr = new int[student];

            double sum = 0;

            for(int j = 0; j < student; j++){
                int score = sc.nextInt();
                arr[j] = score;
                sum += score;
            }
            double avg = (sum / student);
            double cnt = 0;

            for(int j = 0; j < student; j++){
                if(arr[j] > avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/student)*100);
        }
        sc.close();
    }

    public void method2(){

        int[] score;
        int Tcase = sc.nextInt();

        for(int i = 0; i < Tcase; i++){
            int std = sc.nextInt();
            score = new int[std];

            double sum = 0;

            for(int j = 0; j < std; j++){

            }
        }
    }
}
