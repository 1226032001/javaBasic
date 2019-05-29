package com.neuedu.May28;

public class Floater extends People {
    private int hour;//小时

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }



    public void  computeSalay(){
        System.out.println(hour);
    }
    public void printFloater(){
        System.out.println("姓名"+getName()+"性别"+getSex());
    }
}
