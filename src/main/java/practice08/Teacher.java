package practice08;

public class Teacher extends Person{

    Klass klass ;

    public Teacher(String name, int age, int id, Klass klass) {
        super(name, age, id);
        this.klass = klass;
    }

    public Teacher(String name,int age,int id){
        super(name, age, id);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){

        String result = "";
        if(this.klass==null){
            result = super.introduce()+" I am a Teacher. I teach No Class.";
        }else{
            result = super.introduce()+" I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
        }
        return result;
    }

    public String introduceWith(Student student){
        String result = "";
        if(student.getKlass().equals(this.getKlass())){
            result = super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            result = super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return result;
    }
}
