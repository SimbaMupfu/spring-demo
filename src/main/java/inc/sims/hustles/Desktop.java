package inc.sims.hustles;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop object created...");
    }

    @Override
    public void compileCode() {
        System.out.println("Compiling code on Desktop");
    }
}
