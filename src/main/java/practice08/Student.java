package practice08;

public class Student extends Person{

    Klass klass;

    public Student(String name, int age, int id, Klass klass) {
        super(name, age, id);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){

        String result = super.introduce()+ "I am a Student. I am at Class"+this.getKlass()+".";
        return result;
    }
}
