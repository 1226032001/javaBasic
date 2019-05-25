package com.neuedu.test;

public class H5 {
    public static void main(String[] args) {

       /* 分别计算1-100之间的奇数和 和偶数和*/

        int sumji =0;
        int sumo =0;

        for (int i =1;i<=100;i++){
            if(i%2!=0){
                sumji += i;

            }else if (i%2==0){

                sumo += i;


            }

        }
        System.out.println("奇数和："+sumji);
        System.out.println("偶数和："+sumo);
    }
}
