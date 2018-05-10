package practice10;

import java.util.ArrayList;

public class Teacher extends Person{
    int classes ;
    ArrayList<Integer> course = new ArrayList<>();

    public Teacher(int id, String name, int age, int classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public String introduce(){

        String result = "";
        String temp = course.toString();
        course.add(this.classes);
        if(course.size()==0){
            result = super.introduce()+" I am a Teacher. I teach No Class.";
        }else{
            result = super.introduce()+" I am a Teacher. I teach Class "+temp;
        }
        return result;
    }

    public boolean isTeaching(Student student){
        String result = "";
        if(course.contains((student.getKlass().number))){

        }else{

        }

    }
}
