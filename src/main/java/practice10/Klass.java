package practice10;

import java.util.ArrayList;

public class Klass {

    String leader;
    int number;
    ArrayList<Integer> studentList = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String assignLeader(Student student){

        if(!studentList.contains(student.getId())){
            leader = "It is not one of us.";
        }else {
            leader = student.getName();
        }
        return leader;
    }

    public ArrayList<Integer> appendMember(Student student){
        studentList.add(student.getId());
        return studentList;
    }

    public boolean isIn(Student student){
        boolean result  = false;
        if(student.getKlass().number!=0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
