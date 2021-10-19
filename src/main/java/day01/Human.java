package day01;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void intro(){System.out.println("Hello, I am " + this.name);}

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
}
