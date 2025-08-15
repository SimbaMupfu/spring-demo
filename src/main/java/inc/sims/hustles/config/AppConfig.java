package inc.sims.hustles.config;

import inc.sims.hustles.Computer;
import inc.sims.hustles.Desktop;
import inc.sims.hustles.Laptop;
import inc.sims.hustles.Programmer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "laptop")
    public Laptop laptop(){
        return new Laptop();
    }

    @Bean
    public Programmer programmer(@Qualifier("desktop") Computer com){
        Programmer programmer = new Programmer();
        programmer.setAge(24);
        programmer.setComputer(com);
        return programmer;
    }

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
