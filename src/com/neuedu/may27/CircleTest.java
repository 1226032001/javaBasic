package com.neuedu.may27;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       double  r = input.nextDouble();
        System.out.println("请输入圆的半径");
        Circle yuan = new Circle();
        double zhouchang = yuan.zhouchang(r);
        double mianji  = yuan.mianji(r);
        if (r<0){
            System.out.println("半径不得为负数");
        }else if(r>0){
            System.out.println("圆的周长："+yuan.zhouchang(r));
            System.out.println("圆的面积："+yuan.mianji(r));
        }
    }


}
