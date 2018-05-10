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

    public String introduce(){

        String result = "";
        System.out.println(this.getName());
        System.out.println(this.klass.getLeader()+" leader");

        if(this.getName().equals(this.klass.getLeader())) {
            result = super.introduce() + " I am a Student. I am Leader of Class 2.";
        }else{
            result = super.introduce()+" I am a Student. I am at Class 2.";
        }
        return result;
    }
}
