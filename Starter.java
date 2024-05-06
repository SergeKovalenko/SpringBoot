package Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "Springboot")
public class Starter {
    public static void main(String[] args){
        ApplicationContext ctx= SpringApplication.run(Starter.class,args);
        DepartmentRepo dr=ctx.getBean(DepartmentRepo.class);
        Department d1 = new Department(1,"IT");
        dr.save(d1);
        dr.findAll().forEach(System.out::println);
        dr.findByName("Name2").forEach(System.out::println);
        System.out.println("---findByNameStartsWith");
    }
}
