package com.neuedu.test;

public class H3 {
    public static void main(String[] args) {
        /*题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列*/
        int n =0;
        for(int a =1;a<=4;a++)
            for (int b=1;b<=4;b++)
                for (int c=1;c<=4;c++)
                {
                    if (a!=b&&b!=c&&a!=c&&n++!=0){
                        System.out.println("第"+n+"个"+a+b+c);
                    }
                } System.out.println("共有"+n+"种");
    }
}
