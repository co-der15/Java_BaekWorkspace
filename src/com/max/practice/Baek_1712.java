package com.max.practice;

import java.util.Scanner;

public class Baek_1712 {
    public void method1(){
        // 순익분기점
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 고정비용
        int B = sc.nextInt(); // 가변비용
        int C = sc.nextInt(); // 1EA 상품 가격
        // A + B : 총 비용
        // n + C : 총 수입
        // n : 수량

        if(C<=B){
            System.out.println("-1"); // 이익이 없으면
        } else {
            System.out.println((A/(C-B))+1);
            //(n * C) = A + ( n * B)
            // n = A / ( C - B )
            // 이익 = ( A / (C - B ) + 1
        }
    }
}
