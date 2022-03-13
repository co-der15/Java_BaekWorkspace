package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1152 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void method1() throws IOException {

        String str = br.readLine();

        String[] arr = str.split(" ");

        System.out.println(arr.length);
    }

    public void method2() throws IOException{

        // String str = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());
    }

    public void method3() throws IOException{

        int cnt = 0;
        int pre_str = 32; // ASCII 공배을 의미
        int str;

        while(true){
            str = System.in.read();
            // reads a byte and returns as an integer

            if(str == 32){ // 입력 받은 값이 공백일 때

                if(pre_str != 32) cnt++; // 이전 문자가 공백이 아니면

            } else if(str == 10){ // 입력 받은 값이 개형일 때 ('/n')

                if(pre_str != 32) cnt++; // 이전 문자가 공백이 아니면

                break;
            }
            pre_str = str;
        }
        System.out.println(cnt);
    }
}
