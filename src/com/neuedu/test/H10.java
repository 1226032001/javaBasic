package com.neuedu.test;

import java.util.Scanner;

public class H10 {
    public static void main(String[] args) {

//        一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。

        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        int sum = 0;

        if (a%10>0){
            sum += a%10;
            a = a/10;
            sum += a;

            if (sum%9==0){
                System.out.println("该数能被9整除");
            }else {
                System.out.println("该数不能被9整除");
            }
        }else{
            System.out.println("该数不能被9整除");
        }


       /* while(a%10>0){
            sum += a%10;
            a = a/10;
        }
        sum += a;
        if (sum%9==0){
            System.out.println("该数能被9整除");
        }else {
            System.out.println("该数不能被9整除");
        }
*/



    }

}
