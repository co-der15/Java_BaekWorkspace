package com.max.practice;

import java.util.Scanner;

public class Baek_2525 {
    Scanner sc = new Scanner(System.in);

    public void method1(){

        int A = sc.nextInt(); // hour
        int B = sc.nextInt(); // minute
        int C = sc.nextInt(); // time

        if(C >= 60){
            A++;
            B = B + (C - 60);
            if(B >= 60){
                A++;
                B = 0;
            }
            System.out.println(A + " " + B);
        } else {
            if(B + C >= 60){
                A = 0;
                B = (B+C)-60;
                System.out.println(A + " " + B);
             } else {
                B = B + C;
                System.out.println(A + " " + B);
            }
        }
        // run 했을 때 원하는 값을 받을 수 있었지만 백준에 제출하면 오답이라고 나옴
    }
    public void method2(){

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int hour = (B+C)/60;
        int minutes = (B+C)%60;

        if(A < 23 && B+C < 60){
            System.out.println(A + " " + (B+C));
        } else if(A+hour < 23 && B+C >= 60){
            System.out.println((A+hour) + " " + minutes);
        } else if(A >= 23 && B+C >= 60){
            System.out.println(hour-1 + " " + minutes);
        } else if(A >= 23 && B+C < 60){
            System.out.println(A + " " + (B+C));
        } else if(A+hour >= 24){
            System.out.println((A+hour-24) + " " + minutes);
        }
    }
    // ref : https://velog.io/@nanana/Java-%EB%B0%B1%EC%A4%80-2525%EB%B2%88-%EC%98%A4%EB%B8%90-%EC%8B%9C%EA%B3%84
    // method2 도 오답
    public void method3(){

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int h = A * 60 + B + C;
        A = h/60;
        B = h%60;

        if(A >= 24){
            A = A - 24;
        }
        System.out.println(A + " " + B);
    }
    // ref : https://velog.io/@nanana/Java-%EB%B0%B1%EC%A4%80-2525%EB%B2%88-%EC%98%A4%EB%B8%90-%EC%8B%9C%EA%B3%84
}
