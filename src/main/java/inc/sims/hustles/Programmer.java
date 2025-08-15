package inc.sims.hustles;

import java.beans.ConstructorProperties;

public class Programmer {

    private int age;
    private Computer computer;

    public Programmer(){
        System.out.println("Programmer object created");
    }

    @ConstructorProperties({"age", "computer"})
    public Programmer(int age, Computer computer){
        this.age = age;
        this.computer = computer;
        System.out.println("Parameterised Programmer object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void writeCode(){
        System.out.println("Write code!");
    }
}
