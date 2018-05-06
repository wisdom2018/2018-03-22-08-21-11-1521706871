package practice04;

public class Worker extends Person{

    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        Worker wk = new Worker("Tom",21);
        String result = super.introduce()+" I am a Worker. I have a job.";
        return result;
    }
}
