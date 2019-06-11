package com.neuedu.June_11;
/*编写一个程序，使用集合存储客户的邮件地址。
地址中应该包含姓名，街道，市（县），省（自治区），国家（地区）然后显示集合ArrayList
中的内容*/
public class EmailAddress {
    private String xingming;
    private String jiedao;
    private String city;
    private String provence;
    private String country;

    public EmailAddress(String xingming, String jiedao, String city, String provence, String country) {
        this.xingming = xingming;
        this.jiedao = jiedao;
        this.city = city;
        this.provence = provence;
        this.country = country;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getJiedao() {
        return jiedao;
    }

    public void setJiedao(String jiedao) {
        this.jiedao = jiedao;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "客户邮件地址为："+getXingming()+getJiedao()+getCity()+getProvence()+getCountry();
    }
}
