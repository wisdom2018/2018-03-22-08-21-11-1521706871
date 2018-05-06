package practice06;

public class Teacher extends Person {

    int  Klass = 0;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        //System.out.println(super.introduce() + " I am a Teacher. I teach No Class.");
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int  klass) {
        Klass = klass;
    }

    public String introduce() {
        String result = "";
        if (this.getKlass()!=0) {
            result += super.introduce() + " I am a Teacher. I teach Class " + this.getKlass() + ".";
        }
        if (this.getKlass()==0) {
            result += super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return result;
    }
}

