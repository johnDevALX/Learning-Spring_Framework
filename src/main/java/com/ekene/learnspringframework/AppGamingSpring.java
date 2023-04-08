//package com.ekene.learnspringframework;
//
//import com.ekene.learnspringframework.game.GameRunner;
//import com.ekene.learnspringframework.game.GamingConfiguration;
//import com.ekene.learnspringframework.game.GamingConsole;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class AppGamingSpring {
//    public static void main(String[] args) {
//        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
//            context.getBean(GamingConsole.class).up();
//            context.getBean(GameRunner.class).run();
//        }
//
//    }
//}
