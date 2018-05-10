package practice10;

public class Student extends Person{
    Klass klass ;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        String result = "";
        if(this.klass.leader.equals(this.getName())){
            result = super.introduce()+" I am a Student. I am Leader of Class 2.";
        }else {
            result = super.introduce() + "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.";
        }
        return result;
    }
}
