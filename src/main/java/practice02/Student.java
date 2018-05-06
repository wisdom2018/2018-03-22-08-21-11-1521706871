package practice02;

public class Student extends Person {

    int Klass = 0;

    public Student(String name, int age, int classnumber) {
        super(name, age);
        this.Klass = classnumber;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int Klass) {
        this.Klass = Klass;
    }

    public String introduce() {
        String result = "I am a Student. I am at Class"+" "+ Klass+".";
        return result;
    }
}
