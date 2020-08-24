package pe.example.spring5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pe.example.spring5.service.EmployeeService;
import pe.example.spring5.service.impl.EmployeeServiceImpl;

@Configuration
public class AppConfig {

  @Bean
  public EmployeeService employeeService() {
    return new EmployeeServiceImpl();
  }

}
