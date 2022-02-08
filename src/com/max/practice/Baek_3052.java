package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Baek_3052 {
    public void method1(){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();
        /*
        * HashSet
        * set 인터페이스의 구현 클래스
        * "*중복 값을 저장하지 않음*"
        * 하나의 null 값만 저장할 수 있음
        * 순서 유지되지 않음
        * HashSet<데이터타입> 변수명 = new HashSet<데이터타입>();
        * */

        for(int i = 0; i < 10; i++){
            h.add(sc.nextInt() % 42);
            // .add(value) 메소드를 사용해서 데이터타입에 맞는 값을 추가 가능
            // .remove(value) 원하는 값 삭제
            // .clear() 값 전부 삭제
        }
        System.out.println(h.size());
        // .size() HashSet의 크기를 구함
        /*
        * Iterator 하나의 객체를 가져오고 싶을 때
        * Iterator iter = h.iterator();
        * while(iter.hasNext()){
        *   System.out.println(iter.next() + " ");
        * }
        * */
    }

    public void method2() throws IOException {
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            arr[Integer.parseInt(br.readLine()) % 42] = true;
            // Integer.parseInt(br.readLine() % 42는 객체 주소
            // 객체 값을 false 에서 true 로 변경
            System.out.println(Arrays.toString(arr));
        }

        int cnt = 0;
        for(boolean value : arr){
            if(value){ // value 가 true 라면
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
