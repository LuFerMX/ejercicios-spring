package mx.com.bq.spring.examples;

import java.io.File;

import mx.com.bq.spring.examples.beans.Mundo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        
        try {
            File f = new File("Aqui.txt");
            f.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        ApplicationContext app = new ClassPathXmlApplicationContext("mx/com/bq/spring/examples/xml/beans.xml");
        Mundo m =(Mundo) app.getBean("mundo");
        
        System.out.println(m.getSaludo());
        ((ConfigurableApplicationContext)app).close();
        
    }
}
