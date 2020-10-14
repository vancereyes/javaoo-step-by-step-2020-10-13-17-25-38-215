package practice08;

public class Student extends Person {

    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);

        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass.getLeader() != this) {
            return String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass.getNumber());
        } else {
            return String.format("%s I am a Student. I am Leader of Class %d.", super.introduce(), klass.getNumber());
        }
    }
}
