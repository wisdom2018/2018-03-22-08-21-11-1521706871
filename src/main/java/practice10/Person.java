package practice10;

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

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {                                //同一个对象，不同引用，则相同
            return true;
        }

        if (obj == null) {
            return false;                             //如果传入的对象为空，则返回false；
        }

        if (this.getClass() != obj.getClass()) {           //如果两者属于不同的类型，不能相等
            return false;
        }

        Person temp = (Person) obj;                    //类型相同，比较内容是否相同
        return this.age == temp.getAge() &&
                this.name.equals(temp.getName()) &&     //通过判断两个对象是否完全相同
                this.id == temp.getId();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {
        String result = "";
        result = "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
        return result;
    }
}