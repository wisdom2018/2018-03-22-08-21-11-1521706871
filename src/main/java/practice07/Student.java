package practice07;

public class Student extends Person {
    String Klass = "";

    public Student(String name, int age, String Klass) {
        super(name, age);
        this.Klass = Klass;
    }

    public Student(String name, int age, Klass Klass) {

        super(name, age);

    }

    public String getKlass() {
        return Klass;
    }

    public void setKlass(String Klass) {
        this.Klass = Klass;
    }


    public String introduce() {
        String result = super.introduce() + " I am a Student. I am at Class " + this.getKlass() + ".";
        return result;
    }
}
