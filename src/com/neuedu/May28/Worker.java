package com.neuedu.May28;

public class Worker extends People{


    private int num;//工作天数
    private float salary;//工资

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public void computeSalay(){
        System.out.println(num*salary);
    }
    public void printWorker(){
        System.out.println("姓名"+getName()+"性别"+getSex());
    }

}
