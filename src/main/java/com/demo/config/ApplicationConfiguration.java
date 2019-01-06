package com.demo.config;

import com.demo.impl.SadFortuneService;
import com.demo.impl.SwimCoach;
import com.demo.interfaces.Coach;
import com.demo.interfaces.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// no need for componentscan , because we defined beans in here
//@ComponentScan("com.demo")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

    //define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for our swim coach And inject fortune service
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
