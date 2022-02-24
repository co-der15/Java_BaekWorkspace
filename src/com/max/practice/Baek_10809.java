package com.max.practice;

import java.util.Scanner;

public class Baek_10809 {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }

    }
}
