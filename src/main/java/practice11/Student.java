package practice11;

public class Student extends Person{
    Klass klass ;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student(int id, String name,int age){
        super(id, name, age);
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String result = "";
        if(this.equals(klass.getLeader())){
            result = super.introduce()+" I am a Student. I am Leader of Class 2.";
        }else {
            result = super.introduce() + " I am a Student. I am at Class 2.";
        }
        return result;
    }
}
