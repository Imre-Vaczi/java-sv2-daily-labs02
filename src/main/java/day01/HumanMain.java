package day01;

public class HumanMain {

    public static void main(String[] args) {
        Human human = new Human("John", 37);
        System.out.println(human.getName());
        System.out.println(human.getAge());

        human.intro();
    }

}
