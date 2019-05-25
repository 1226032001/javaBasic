package com.neuedu.test;

//import java.io.IOException;

import java.util.Scanner;

public class H8 {
    public static void main(String[] args)  {
/*另一种字符接受方法
*   在导入Java工具包的前提下
*   Scanner scan = new Scanner(System.in);
 *   String s = scan.next();  接受的为字符串类型
 *   char c = s.chartAt(0);  利用charAt截取字符串类型的第一个字符
 *   最后再输出 c 就完成了*/

        /*编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换*/
//        char w = (char)System.in.read(); 主方法后面需要跟 throws IOE啥的
//        char 类型输入框

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char w = s.charAt(0);


        if (w>='a'&&w<='z'){
             w -= 32;
            System.out.println(w);
        }else if (w>='A'&&w<='Z'){
            System.out.println(w);

        }
    }
}
