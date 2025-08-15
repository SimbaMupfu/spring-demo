package inc.sims.hustles.config;

import inc.sims.hustles.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Laptop getLaptop(){
        return new Laptop();
    }
}
