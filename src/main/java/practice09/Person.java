package practice09;

public class Person {

    int id;
    String name;
    int age;


    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }
}
