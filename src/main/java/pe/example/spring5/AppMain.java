package pe.example.spring5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pe.example.spring5.configuration.AppConfig;
import pe.example.spring5.model.Employee;
import pe.example.spring5.service.EmployeeService;

public class AppMain {

  public static void main(String... args) {
    //Method 1
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    //Method 2
    //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    //ctx.register(AppConfig.class);
    //ctx.refresh();

    EmployeeService empManager = ctx.getBean(EmployeeService.class);
    Employee emp = empManager.create();

    System.out.println(emp);
  }
}
