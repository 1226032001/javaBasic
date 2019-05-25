package com.neuedu.test;


import java.util.Scanner;

public class H7 {
    public static void main(String[] args) {
        /*判断一个年份是平年还是闰年*/

        System.out.println("请输入年份");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if ((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("这一年是闰年");
        }else {
            System.out.println("这一年是平年");
        }
    }
}
