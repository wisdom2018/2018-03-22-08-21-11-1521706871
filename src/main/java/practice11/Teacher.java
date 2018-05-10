package practice11;


import java.util.HashSet;
import java.util.stream.Collectors;

public class Teacher extends Person{
    Klass klass;
    private HashSet<Klass> classes = new HashSet<>();

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age){
        super(id, name, age);
    }


    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce(){
        String result = "";
        if(this.classes.size() == 0){
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        }else{
            result = super.introduce()+" I am a Teacher. I teach "+this.className()+".";
        }
        return result;
    }

    private String className(){
        StringBuilder sb = new StringBuilder("Class ");
        this.classes.forEach(klass-> sb.append(klass.getNumber()+", "));
        return sb.substring(0,sb.length()-2);
    }

    public boolean isTeaching(Student student){
        return this.classes.stream().filter(s->s.isIn(student)).collect(Collectors.toList()).size()>0;
    }

    public String introduceWith(Student stu){
        return super.introduce()+" I am a Teacher. I"+(isTeaching(stu) ?"":" don't")+" teach "+stu.getName()+".";
    }


    public void studentBecomeLeader(Student student, Klass klass){
        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class 2.");
    }

    public void studentJoinClass(Student student, Klass klass){
        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " has joined Class 2.");
    }

}
