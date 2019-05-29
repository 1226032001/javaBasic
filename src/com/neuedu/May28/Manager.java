package com.neuedu.May28;

public class Manager extends People{
    private float guding;//工资
    public float getGuding() {
        return guding;
    }

    public void setGuding(float guding) {
        this.guding = guding;
    }


    public void computeSalay(){
        System.out.println(guding);
    }
    public void printManager(){
        System.out.println("姓名"+getName()+"性别"+getSex());
    }
}

