package inc.sims.hustles;

public class Programmer {

    private int age;

    public Programmer(){
        System.out.println("Programmer object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void writeCode(){
        System.out.println("Write code!");
    }
}
