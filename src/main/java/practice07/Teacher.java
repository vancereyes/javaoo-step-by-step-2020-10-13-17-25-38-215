package practice07;

public class Teacher extends Person{

Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);

        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
}
