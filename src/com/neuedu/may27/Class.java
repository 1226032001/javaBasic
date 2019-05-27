package com.neuedu.may27;

import java.awt.geom.QuadCurve2D;

public class Class {
    /*定义长方形类，含：
  特征：宽、高（整型）；
  方法：求周长、面积；
  方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
并对其进行测试*/



//    无参数
    int cwidth;
    int cheight;
public int zhouchang(){
    return  2*(cwidth+cheight);
}
public int mianji(){
    return  cwidth*cheight;
}

//一个参数
    public int zhouchang1(int a){
    cwidth = a;
    cheight = a;
    return 2*(cwidth+cheight);
    }
    public int mianji1(int a){
        cwidth = a;
        cheight = a;
        return cwidth*cheight;
    }

//    两个参数
    public  int zhouchang2(int a ,int b){
        cwidth = a;
        cheight = b;
        return 2*(cwidth+cheight);
    }
    public int mianji2(int a,int b ){
        cwidth = a;
        cheight = b;
        return cwidth*cheight;
    }

}
