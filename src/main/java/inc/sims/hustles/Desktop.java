package inc.sims.hustles;

public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop object created...");
    }

    @Override
    public void compileCode() {
        System.out.println("Compiling code on Desktop");
    }
}
