package com.neuedu.may27;

public class Circle {
    /*定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
    并对其进行测试*/

    double radius;
    double pai = 3.14;
    public  double zhouchang(double r){
        return 2*pai*r;
    }
    public  double mianji(double r){
        return pai*r*r;
    }


}
