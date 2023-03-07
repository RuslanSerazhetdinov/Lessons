package FullLessons;

public class Lesson24 {
    public static void main(String[] args) {
        Item itemNumberOne = new Item("Tom", 20);
        itemNumberOne.toString();
        System.out.println(itemNumberOne);
        String string = "Hello";
        System.out.println(string);
    }
}

class Item {
    private String name;
    private int age;

    public Item (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+','+age;
    }
}