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

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String assignLeader(Student student){
        String result = "";
        result = "the Leader of "+student.getKlass();
        return result;
    }

    public String getDisplayName(){
        String class_name = "";
        return "Class"+this.getClass();
    }
}
