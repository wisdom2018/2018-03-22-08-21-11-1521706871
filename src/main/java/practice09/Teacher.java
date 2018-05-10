package practice09;

public class Teacher extends Person{

    Klass klass ;

    public Teacher(int age,String name, int id, Klass klass) {
        super(age,name,id);
        this.klass = klass;
    }

    public Teacher(int age,String name,int id){
        super(age, name, id);
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
            result = super.introduce()+" I am a Teacher. I teach Class "+this.getKlass().number+".";
        }
        return result;
    }

    public String introduceWith(Student student){
        String result = "";
        if(student.klass.number==this.klass.number){
            result = super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            result = super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return result;
    }
}

