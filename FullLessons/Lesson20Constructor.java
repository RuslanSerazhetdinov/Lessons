package FullLessons;

public class Lesson20Constructor {
    public static void main(String[] args) {
        People p1 = new People("Bob", 20);
        People p2 = new People("Tom", 40);
        People p3 = new People("Rob", 30);
        p1.printNumberOfPeople();
        p2.printNumberOfPeople();
        p3.printNumberOfPeople();
    }
}

class People {
    private String name;
    private int age;
    private static int countPeople;

    public People(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name){this.name = name;}

    public void setAge(int age){this.age = age;}

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}