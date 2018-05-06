package practice07;

public class Teacher extends Person{

    String Klass = "";

    public Teacher(String name, int age, String Klass) {
        super(name, age);
        this.Klass = Klass;
    }


    public Teacher(String name, int age, Klass Klass) {
        super(name, age);


    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String getKlass() {
        return Klass;
    }

    public void setKlass(String klass) {
        Klass = klass;
    }

    public String introduce() {
        String result = "";
        if (this.getKlass() != null) {
            result = super.introduce() +  "I am a Teacher. I teach "+this.getClass()+".";

        }else if(this.getKlass() == null) {
            result = super.introduce() + "I am a Teacher. I teach No Class.";
        }
        return result;
    }

    public String introduceWith(Student t){
        String result = "";
        if(this.getKlass().equals(t.getKlass())){
            result = super.introduce()+" I am a Teacher. I teach "+t.getName()+".";
        }else{
            result = super.introduce()+"I am a Teacher. I don't teach "+t.getName();
        }
        return result;
    }
}
