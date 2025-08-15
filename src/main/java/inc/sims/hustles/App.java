package inc.sims.hustles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Programmer programmer = context.getBean(Programmer.class);
        programmer.writeCode();
        System.out.println(programmer.getAge());
        programmer.getComputer().compileCode();
    }
}
