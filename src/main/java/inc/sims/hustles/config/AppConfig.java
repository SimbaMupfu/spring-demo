package inc.sims.hustles.config;

import inc.sims.hustles.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "laptop")
    @Scope(scopeName = "prototype")
    public Laptop laptop(){
        return new Laptop();
    }
}
