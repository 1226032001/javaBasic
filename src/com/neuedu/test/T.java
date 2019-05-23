package com.neuedu.test;
import java.util.Scanner;//要使用scanner这个类，就需要导入一个输入接口相关的包
public class T {
    public static void main(String[] args) {
        /*int a =654;
        int b = 0;
        while (a !=0){
            b = a%10;
            System.out.print(b);
            a = a/10;
        }
*/
        int a = 186;
        int b = a%10;
        int c =a/10%10;
        int d= a/100%10;
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        }
}
