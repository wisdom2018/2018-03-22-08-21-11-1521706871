package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Klass {
    private Student leader;
    private Integer number;
    ArrayList<Integer> studentList = new ArrayList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName(){
        return "Class 2";
    }

    public void assignLeader(Student student){

        if(student.getKlass()!=this){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = student;
            this.teachers.forEach(teacher -> teacher.studentBecomeLeader(student,this));
        }
    }

    public void appendMember(Student student){
        student.getKlass().setNumber(this.number);
    }

    public boolean isIn(Student student){
        boolean result  = false;
        if(student.getKlass()==this){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
}
