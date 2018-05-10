package practice09;

public class Person {
    String name = "";
    int age = 0;
    int id = 0;

    public Person(int age,String name,int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String introduce(){

        String result = "My name is "+this.getName()+". I am "+this.getAge()+" years old.";
        return result;
    }
}
