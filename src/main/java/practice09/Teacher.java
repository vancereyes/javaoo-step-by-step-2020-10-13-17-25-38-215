package practice09;

public class Teacher extends Person {

    Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);

        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass != null ) {
            return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass.getNumber());
        }     return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public String introduceWith(Student student){

        if(klass.getNumber() == student.getKlass().getNumber())
        {
        return String.format("%s I am a Teacher. I teach %s.",super.introduce(),student.getName());
    } else {
        return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),student.getName());
        }
    }


}
