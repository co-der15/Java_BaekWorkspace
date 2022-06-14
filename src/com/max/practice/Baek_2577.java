package com.max.practice;

import java.util.Scanner;

public class Baek_2577 {
    public void method(){
        Scanner sc = new Scanner(System.in);

        int total = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String value = Integer.toString(total);
        // int -> String 형변환

        for(int i = 0; i < 10; i++){
            int cnt = 0;
            for(int j = 0; j < value.length(); j++){
                if((value.charAt(j) - '0') == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
