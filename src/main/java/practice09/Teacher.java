package practice09;

public class Teacher extends Person {

    public static final String TEACHER = "I am a Teacher. I teach";
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

    @Override
    public String introduce(){
        if(klass != null ) {
            return String.format("%s " + TEACHER + " %s.", super.introduce(), klass.getDisplayName());
        }     return String.format("%s " + TEACHER + " No Class.", super.introduce());
    }



    public String introduceWith(Student student){

        if(klass.getNumber() == student.getKlass().getNumber())
        {
        return String.format("%s " + TEACHER + " %s.",super.introduce(),student.getName());
    } else {
        return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),student.getName());
        }
    }


}
