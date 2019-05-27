package com.neuedu.may27;

import java.io.IOException;
import java.util.Scanner;

public class JiSuanQiTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        char c ='+';
        char d = '-';
        char e = '*';
        char f = '/';
        System.out.println("请输入第一个数字");
        double a = input.nextDouble();
        System.out.println("请输入符号");
        char z = (char)System.in.read();
        System.out.println("请输入第二个数字");
        double b = input.nextDouble();

        JiSuanQi sca = new JiSuanQi();
        double jia = sca.jia(a,b);
        double jian = sca.jian(a,b);
        double cheng = sca.cheng(a,b);
        double chu  = sca.chu (a,b);

        if (z==c){
            System.out.println("输出结果为："+sca.jia(a,b));
        }else if (z==d){
            System.out.println("输出结果为："+sca.jian(a,b));
        }else if (z==e) {
            System.out.println("输出结果为："+sca.cheng(a, b));
        }else if (z==f) {
            System.out.println("输出结果为："+sca.chu(a, b));
        }
    }
}
