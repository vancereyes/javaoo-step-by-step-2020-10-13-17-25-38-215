package practice06;

public class Teacher extends Person {

    public static final String TEACHER = "I am a Teacher. I teach";
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);

        this.klass = klass;

    }

    public Teacher(String name, int age){
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }


    @Override
    public String introduce(){

        if (klass == 0){
            return String.format("%s " + TEACHER + " No Class.", super.introduce());
        }

            return String.format("%s " + TEACHER + " Class %d.",super.introduce(),klass);
    }

}


