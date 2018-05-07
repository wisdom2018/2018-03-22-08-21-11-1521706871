package practice07;

public class Student extends Person {
    Klass Klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass Klass) {
        super(name, age);
        this.Klass = Klass;
    }

    public Klass getKlass() {
        return Klass;
    }

    public void setKlass(Klass Klass) {
        this.Klass = Klass;
    }

    public String introduce() {
        String result = super.introduce() + " I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
        return result;
    }
}
