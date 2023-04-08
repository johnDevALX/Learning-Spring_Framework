package com.ekene.learnspringframework;

import com.ekene.learnspringframework.game.*;
import com.ekene.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ekene.learnspringframework.game")
public class AppGamingSpring02 {
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        return new GameRunner(game);
//    }
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppGamingSpring02.class)){
            context.getBean(GameRunner.class).run();
        }
    }
}
