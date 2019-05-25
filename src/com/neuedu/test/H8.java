package com.neuedu.test;

import java.io.IOException;

public class H8 {
    public static void main(String[] args) throws IOException {


        /*编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换*/
        char w = (char)System.in.read();
//        char 类型输入框


        if (w>='a'&&w<='z'){
             w -= 32;
            System.out.println(w);
        }else if (w>='A'&&w<='Z'){
            System.out.println(w);

        }
    }
}
