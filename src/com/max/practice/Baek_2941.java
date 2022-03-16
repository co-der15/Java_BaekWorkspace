package com.max.practice;

import java.util.Scanner;

public class Baek_2941 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int cnt = 0;

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i); // st 문자열을 문자 하나식 불러 내기

            if(ch == 'c'){
                if(i < st.length() - 1){ // StingIndexOutOfBoundException 방지
                    if(st.charAt(i + 1) == '='){
                        // i + 1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위한 1 증가
                        i++;
                    } else if(st.charAt(i + 1) == '-'){
                        i++;
                    }
                }
            } else if(ch == 'd') {
                if(i < st.length() - 1){
                    if(st.charAt(i + 1) == 'z'){
                        if(i < st.length() - 2) {
                            if(st.charAt(i + 2) == '='){
                                i += 2;
                            }
                        }
                    }
                    else if(st.charAt(i + 1) == '-'){
                        i++;
                    }
                }
            } else if(ch == 'l'){
                if(i < st.length() - 1){
                    if(st.charAt(i + 1) == 'j'){
                        i++;
                    }
                }
            } else if(ch == 'n'){
                if(i < st.length() - 1) {
                    if(st.charAt(i + 1) == 'j'){
                        i++;
                    }
                }
            } else if(ch == 's'){
                if(i < st.length() - 1){
                    if(st.charAt(i + 1) == '='){
                        i++;
                    }
                }
            } else if (ch == 'z'){
                if(i < st.length() - 1){
                    if(st.charAt(i + 1) == '='){
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
