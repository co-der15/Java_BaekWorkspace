package com.max.practice;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Baek_2753 {
    public void method(){
        Scanner sc = new Scanner(System.in);

/*        윤년 : 해당 연도를 4로 나눈 값이 0인 것
              100으로 나눈 값이 0인 것은 윤년에서 제외
              400으로 나눈 값이 0인 것은 윤년으로 포함

        평년 : 윤년 외 나머지 연도


         if 조건문을 활용한 윤년 값 계산산

       System.out.println("연도를 입력하시오.");
       int year = sc.nextInt();

       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
           System.out.println(year + "년은 윤년");
       } else {
           System.out.println(year + "년은 평년");
       }

        GregorianCalendar 클래스의 isLeapYear 메소드 이용한 계산
        isLeapYear 메소드는 매개값이 윤년이면 true 아니면 false 를 리턴 하는 boolean 형


        System.out.println("연도를 입력하시오.");
        int year = sc.nextInt();

        GregorianCalendar gc = new GregorianCalendar();

        if(gc.isLeapYear(year)){
            System.out.println(year + "년은 윤년");
        } else {
            System.out.println(year + "년은 평년");
        }*/

        int year = sc.nextInt();

        GregorianCalendar gc = new GregorianCalendar();

        if(gc.isLeapYear(year)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
