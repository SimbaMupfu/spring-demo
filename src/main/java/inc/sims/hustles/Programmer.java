package inc.sims.hustles;

import java.beans.ConstructorProperties;

public class Programmer {

    private int age;
    private Laptop laptop;

    public Programmer(){
        System.out.println("Programmer object created");
    }

    @ConstructorProperties({"age", "laptop"})
    public Programmer(int age, Laptop laptop){
        this.age = age;
        this.laptop = laptop;
        System.out.println("Parameterised Programmer object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void writeCode(){
        System.out.println("Write code!");
    }
}
