package com.neuedu.test;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {

        /*一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 */

        System.out.println("请输入五位数");
        Scanner input = new Scanner(System.in);
        int i=input.nextInt();
        System.out.println(i);
        if (i>10000&&i<100000){
            int w = i/10000;
            int k = (i%10000)/1000;
            int b = (i%1000)/100;
            int s = (i%100)/10;
            int g =i%10;
            if (w==g&&k==s){
                System.out.println("这五位数是回文数");
            }else {
                System.out.println("这五位数666不是回文数");
            }
        }else {
            System.out.println("输入值不是五位数");
        }


        /*for(int i=10000;i<=99999;i++){
            int w = i/10000;
            int k = (i%10000)/1000;
            int b = (i%1000)/100;
            int s = (i%100)/10;
            int g =i%10;
            if (w==g&&k==s){
                System.out.println("回文数："+w+k+b+s+g);
            }else {
                System.out.println("不是回文数");
            }

        }*/

    }


}
