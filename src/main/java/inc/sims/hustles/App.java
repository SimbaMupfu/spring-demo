package inc.sims.hustles;

import inc.sims.hustles.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Programmer myProgrammer = context.getBean(Programmer.class);
        myProgrammer.writeCode();
        System.out.println(myProgrammer.getAge());

        Laptop lt = context.getBean("laptop", Laptop.class);


        /**The code below use the XML based configuration*/
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Programmer programmer = context.getBean(Programmer.class);
//        programmer.writeCode();
//        System.out.println(programmer.getAge());
//        programmer.getComputer().compileCode();
    }
}
