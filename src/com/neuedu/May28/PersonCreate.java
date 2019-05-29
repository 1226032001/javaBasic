package com.neuedu.May28;

public class PersonCreate  {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zhangsan";
        p1.height = 1.73;
        p1.age = 33;

        Person p2 = new Person();
        p2.name  = "lishi";
        p2.height = 1.74;
        p2.age = 44;

        p1.sayHello();
        p2.sayHello();
    }


}
