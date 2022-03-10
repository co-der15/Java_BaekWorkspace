package com.max.practice;

import java.util.Scanner;

public class Baek_2675 {
    Scanner sc = new Scanner(System.in);

    public void method1() {
        int num = sc.nextInt();
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            arr[i] = sc.next();

            char[] arr1 = new char[arr[i].length()];

            for (int j = 0; j < arr[i].length(); j++) {
                for (int k = 0; k < num2; k++) {
                    arr1[j] = arr[i].charAt(j);
                    System.out.print(arr1[j]);
                    /*
                    for(int j = 0; j < arr[i].length(); j++){
                        arr1[j] = arr[i].charAt(j);
                        System.out.println(arr1);
                    }
                    구한 값을 몇 번 반복할지 구현 안함
                    출력하는 방식도 틀림 "println" --> "print"
                    * */
                }
            }
        }
    }
    public void method2() {
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num2; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
