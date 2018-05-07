package practice07;

public class Teacher extends Person {

    Klass klass;

    public Teacher(String name, int age, Klass Klass) {
        super(name, age);
        this.klass = Klass;

    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        klass = klass;
    }

    public String introduce() {
        String result = "";
        if (this.getKlass() != null) {
            result = super.introduce() + " I am a Teacher. I teach Class " + this.getKlass().getNumber() + ".";

        } else if (this.getKlass() == null) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return result;
    }

    public String introduceWith(Student t) {
        String result = "";
        if (this.getKlass().equals(t.getKlass())) {
            result = super.introduce() + " I am a Teacher. I teach " + t.getName() + ".";
        } else {
            result = super.introduce() + " I am a Teacher. I don't teach " + t.getName() + ".";
        }
        return result;
    }
}
