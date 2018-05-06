package practice05;

public class Student extends Person{
    int Klass = 0;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    public String introduce(){
        Student st = new Student("Tom",21,2);
        String result = super.introduce()+" I am a Student. I am at Class "+st.getKlass()+".";
        return result;
    }
}
