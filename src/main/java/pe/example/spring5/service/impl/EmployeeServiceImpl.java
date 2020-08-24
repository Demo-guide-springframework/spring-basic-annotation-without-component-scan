package pe.example.spring5.service.impl;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import pe.example.spring5.model.Employee;
import pe.example.spring5.service.EmployeeService;

@Lazy
@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Override
  public Employee create() {
    return Employee.builder()
      .id(1)
      .name("Hector")
      .build();
  }

  @PostConstruct
  public void onInit(){
    System.out.println("EmployeeManagerImpl Bean is Created !!");
  }
}
