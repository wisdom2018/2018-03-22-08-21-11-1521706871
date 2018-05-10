package practice09;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Klass {

    int number;
    String leader;
    ArrayList<String> studentList;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String assignLeader(Student student) {

        if (studentList.size() == 0) {
            leader = student.getName();
        } else if (studentList.contains(student.getName())) {
            leader = "It is not one of us.\n";
        } else {
            leader = student.getName();
        }
        return  leader;
    }

    public String getLeader() {

        return leader;
    }

    public ArrayList<String> appendMember(Student student) {
        studentList = new ArrayList<String>();
        System.out.println(student.getName());
        studentList.add(student.getName());
        return studentList;

    }

    public String getDisplayName() {

        String result = "Class 2";
        return result;
    }
}
