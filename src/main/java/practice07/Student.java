package practice07;

public class Student extends Person{

    Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);

        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){

        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.",name,age,klass.getNumber());
    }

}
