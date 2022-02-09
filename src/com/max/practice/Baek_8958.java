package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Baek_8958 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[sc.nextInt()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
            System.out.println(Arrays.toString(arr));
        }
        for(int i = 0; i < arr.length; i++){
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'o'){
                    // .CharAt() : returns the Character at the specified index in a String
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }

    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        for(int i = 0; i < num; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < num; i++){
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'o'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
