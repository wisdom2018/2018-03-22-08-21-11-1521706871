package practice09;

public class Student extends Person{

    Klass klass  ;

    public Student(int age,String name, int id, Klass klass) {
        super(age, name, id);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.equals(klass.getLeader()))
            return super.introduce()+" I am a Student. I am Leader of Class 2.";
        else
            return super.introduce()+" I am a Student. I am at Class 2.";
    }
}
