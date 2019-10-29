package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm: ");
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 ==0){
                    System.out.printf("%d là năm nhuận", year);
                }else{
                    System.out.printf("%d không là năm nhuận", year);
                }
            }else{
                System.out.printf("%d là năm nhuận", year);
            }
        }else{
            System.out.printf("%d không là năm nhuận");
        }
    }
}
