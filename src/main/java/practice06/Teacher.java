package practice06;

public class Teacher extends Person {

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

    public String introduce(){

        if (klass == 0){
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        }

            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.",name,age,klass);
    }

}


