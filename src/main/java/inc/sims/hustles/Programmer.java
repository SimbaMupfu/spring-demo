package inc.sims.hustles;

public class Programmer {

    private int age;
    private Laptop laptop;

    public Programmer(){
        System.out.println("Programmer object created");
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
