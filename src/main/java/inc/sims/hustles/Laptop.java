package inc.sims.hustles;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop object created...");
    }

    @Override
    public void compileCode(){
        System.out.println("Compiling code on Laptop");
    }
}
