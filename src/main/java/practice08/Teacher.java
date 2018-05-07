package practice08;

public class Teacher extends Person{

    Klass klass ;

    public Teacher(String name, int age, int id, Klass klass) {
        super(name, age, id);
        this.klass = klass;
    }

    public String introduce(){

        String result = "";
        if(this.klass==null){
            result = super.introduce()+"I am a Teacher. I teach No Class";
        }else{
            result = super.introduce()+"I am a Teacher. I teach Class"+this.getClass()+".";
        }
        return result;
    }
}
