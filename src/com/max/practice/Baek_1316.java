package com.max.practice;

import java.util.Scanner;

public class Baek_1316 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

       /* int num = sc.nextInt();
        String[] str = new String[num];
        int cnt = 0;

        for(int i = 0; i < num; i++){
            str[i] = sc.next();
        }

        for(int i = 0; i < num; i++){
            for(int j = 0; j < str[i].length(); j++){
                System.out.print(str[i].length());
                char ch = str[i].charAt(j);
                System.out.print(ch);
               if(ch == str[i].charAt(j+1)){
                   System.out.print(ch);
                    break;
                }
                java.lang.StringIndexOutOfBoundsException: String index out of range: 3
                String 클래스가 가지고 있는 문자열의 길이에 맞지 않는 메모리 공간에 접근하려고 할때 발생하는 예외
                hapnew 하고 예외 발생
                str[0].charAt[3,4]가 같음으로 반복문 종료
                str[1].charAt[j+1]에서 2+1는 없는데 접근해서 예외 발생
            }
            cnt++;
        }
        System.out.println(cnt); */
        // -------------------------------------------------------------------------------------------

        int num = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < num; i++){
            String str = sc.next();
            boolean check[] = new boolean[26];
            boolean tmp = true;
            // Boolean vs boolean
            /*
            * Boolean
            *   참조형, 참조값(주소)을 가짐
            *   null 을 담을 수 있음
            *
            * boolean
            *   기본형, 메모리에 직접 값을 저장
            *   null 을 담을 수 없으며 true, false 만 담을 수 있음
            *
            * 메모리나 성능면에서는 기본형인 boolean 이 우수
            * But null 을 담아야하거나 제네릭을 사용해야한다면 Boolean 타입을 사용하는 것이 좋음
            * */

            for(int j = 0; j < str.length(); j++){
                int index = str.charAt(j)-'a';
                if(check[index]){
                    if(str.charAt(j) != str.charAt(j - 1)){
                        tmp = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if(tmp) cnt++;
        }
        System.out.println(cnt);
        // ref : https://cocoon1787.tistory.com/613
        // ref : https://bamboo-programmer.tistory.com/6
    }
}
