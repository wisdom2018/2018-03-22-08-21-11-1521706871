package practice06;

public class Student extends Person{

    int  Klass = 0;

    public Student(String name, int age, int kclass) {
        super(name, age);
        Klass = kclass;
    }

    public int  getKlass() {
        return Klass;
    }

    public void setKclass(int Klass) {
        Klass = Klass;
    }


    public String introduce(){
        String result = super.introduce()+" I am a Student. I am at Class "+this.getKlass()+".";
        return result;
    }
}
