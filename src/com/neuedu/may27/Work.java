package com.neuedu.may27;

public class Work {
    public static void main(String[] args) {
        Class quad =   new Class();//创建对象
        quad.cheight=1;
        quad.cwidth=1;
       int zhouchang = quad.zhouchang();
       int mianji =  quad.mianji();
//        返回值方法需要接受
        System.out.println("无参数时：");
        System.out.println("长方形周长"+zhouchang);
        System.out.println("长方形面积"+mianji);



        Class quad1 = new Class();
        int zhouchang1 = quad1.zhouchang1(5);
        int mianji1 = quad1.mianji1(5);
        System.out.println("有一个参数时：");
        System.out.println("长方形周长" + zhouchang1);
        System.out.println("长方形面积" + mianji1);


        Class quad2 = new Class();
        int zhouchang2 = quad2.zhouchang2(5,9);
        int mianji2 = quad2.mianji2(5,9);
        System.out.println("有两个参数时：");
    System.out.println("长方形周长" + zhouchang2);
       System.out.println("长方形面积" + mianji2);
    }
}
