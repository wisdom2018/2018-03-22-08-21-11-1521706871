package practice11;

public class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public boolean equals(Object obj){

        if(this==obj){
            return true;
        }

        if(obj==null){
            return false;
        }

        if(getClass()!=obj.getClass()){
            return false;
        }

        Person other = (Person) obj;
        return other.getId()==this.getId()
                &&other.getAge()==this.age
                &&other.getName().equals(this.name);
        }

    public String introduce(){
        String result = "";
        result = "My name is "+this.getName()+". I am "+this.getAge()+" years old.";
        return result;
    }
}
