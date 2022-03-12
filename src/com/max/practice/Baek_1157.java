package com.max.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek_1157 {

    Scanner sc = new Scanner(System.in);

    public void method1(){
        int[] arr = new int[26]; // 26 alphabet
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){ // Uppercase alphabet range
                // if(65 <= str.charAt(i) && str.charAt(i) <= 90)
                arr[str.charAt(i) - 'A']++;
                //arr[str.charAt(i) - 65]++;
            } else {
                arr[str.charAt(i) - 'a']++; // lowercase alphabet range
                //arr[str.charAt(i) - 97]++;
            }
        }

        int max = -1;
        char ch = '?';

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65); // output uppercase
                // ch = (char)(i - 65) output : fail to get value cuz of subtraction
            } else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }

    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(65 <= str.charAt(i) && str.charAt(i) <= 90){
                arr[str.charAt(i) - 65]++;
            } else {
                arr[str.charAt(i) - 97]++;
            }
        }
        int max = -1;
        char ch = '?';

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65);
            } else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
