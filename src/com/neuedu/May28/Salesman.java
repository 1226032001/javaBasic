package com.neuedu.May28;
//子类
public class Salesman extends People{
    //减少代码冗余度
//    面向对象语言的特征 1.封装 2.继承
//    继承 父类 子类  继承 二次封装  在已有类的基础上将类与类之间的共同特征再次进行抽象


    private float basic;//基本工资
    private float exsalary;//提成



    public float getBasic() {
        return basic;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public float getExsalary() {
        return exsalary;
    }

    public void setExsalary(float exsalary) {
        this.exsalary = exsalary;
    }
    public void computeSalay(){
        System.out.println(basic+exsalary);
    }
    public void printSalesman(){
        System.out.println("姓名"+getName()+"性别"+getSex());
    }


}
