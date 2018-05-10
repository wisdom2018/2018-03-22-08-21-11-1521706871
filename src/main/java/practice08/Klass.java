package practice08;

public class Klass {

    int number;
    String leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }


    public String assignLeader(Student student){
        String result = "";
        result = " I am Leader of Class "+student.getKlass();
        String leadername = student.name;
        return leadername ;
    }


    public String getLeader(){
        return this.leader;
    }

    public String getDisplayName(){
        String class_name = "";
        return "ç";
    }
}
