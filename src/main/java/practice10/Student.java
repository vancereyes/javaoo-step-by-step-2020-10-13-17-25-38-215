package practice10;

public class Student extends Person {

    Klass klass2;

    public Student(int id, String name, int age, Klass klass2) {
        super(id, name, age);
        this.klass2 = klass2;
    }

    public Klass getKlass() {
        return klass2;
    }

    @Override
    public String introduce(){
        if(klass2.getLeader() != this) {
            return String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass2.getNumber());
        } else {
            return String.format("%s I am a Student. I am Leader of Class %d.", super.introduce(),klass2.getNumber());
        }
    }
}
