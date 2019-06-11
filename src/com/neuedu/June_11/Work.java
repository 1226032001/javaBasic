package com.neuedu.June_11;

public class Work {
    private String name;
    private  int age;
    private double salary;

    public Work(String name, int age, double salsry) {
        this.name = name;
        this.age = age;
        this.salary = salsry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalsry() {
        return salary;
    }

    public void setSalsry(double salsry) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + "  work");
    }

    @Override
    public String toString() {
        return "Worker [age=" + age + ", name=" + name + ", salary=" + salary + "]";
    }

}
