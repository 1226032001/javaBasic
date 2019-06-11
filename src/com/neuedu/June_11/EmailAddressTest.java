package com.neuedu.June_11;

import java.util.ArrayList;
import java.util.List;

public class EmailAddressTest {
    public static void main(String[] args) {
        List<EmailAddress> list = new ArrayList<>();

        list.add(new EmailAddress("张三","这是一个街道","这是一个城市","这是一个省","这是一个国家"));

        System.out.println("客户的邮件地址为："+list.toString());
    }
}
