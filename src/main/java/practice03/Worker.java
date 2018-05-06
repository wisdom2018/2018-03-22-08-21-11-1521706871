package practice03;

public class Worker extends Person{

    public Worker(String name, int age) {
        super(name, age);
    }


    public String introduce(){
        Worker worker = new Worker("Tom",21);

        String result = "I am a Worker. I have a job.";
        return result;
    }
}
