package com.max.practice;

import java.util.Scanner;

public class Baek_1316 {

    static Scanner sc = new Scanner(System.in);

    public void method1(){
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

    public static boolean check(){
        boolean[] check = new boolean[26];
        String str = sc.next();
        int prev = 0;

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i); // i 번쨰 문자 저장 (현재 문자)

            if(prev != now){ // 앞선 문자와 i 번째 문자가 같지 않다면?
                if(check[now - 'a'] == false){ // 해당 문자가 처음 나오는 경우 (false 인 경우)
                    check[now - 'a'] = true;   // true 로 바꿔준다
                    prev = now;                // 다음 턴을 위해 prev 도 바꿔준다
                } else {                       // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                    return false;              // 함수 종료
                }
            } else {                           // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
                continue;                      // else 문은 없어도 됨
            }
        }
        return true;
        // ref : https://st-lab.tistory.com/69
    }
}
