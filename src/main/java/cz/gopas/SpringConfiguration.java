package cz.gopas;

import javax.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

@Configuration
@ComponentScan
@EnableJpaRepositories
public class SpringConfiguration {

    @PostConstruct
    public void init(){
        System.out.println("SPRING CONFIG INIT");
    }
}
