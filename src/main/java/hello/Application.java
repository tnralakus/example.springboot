package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by TTTALAKUS on 30.06.2015.
 */
// @SpringBootApplication
// Configuration EnableAutoConfiguration EnableWebMvc ComponentScan
public class Application
{

   /*public static void main(String[] args)
    {
        loadContext();
    }*/

    public static void loadContext()
    {
        ApplicationContext ctx = SpringApplication.run(Application.class);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames)
        {
            System.out.println(beanName);
        }
    }
}
