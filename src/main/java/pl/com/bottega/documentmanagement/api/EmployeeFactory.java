package pl.com.bottega.documentmanagement.api;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;
import pl.com.bottega.documentmanagement.domain.Employee;
import pl.com.bottega.documentmanagement.domain.EmployeeId;
import pl.com.bottega.documentmanagement.domain.Role;

/**
 * Created by bernard.boguszewski on 31.07.2016.
 */
@Service
public class EmployeeFactory {

    private String INITIAL_ROLE = "STAFF";

    private PasswordHasher passwordHasher;

    public EmployeeFactory(PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }


    public Employee create(String login, String password, EmployeeId employeeId){
        Employee employee = new Employee(login, passwordHasher.hashedPassword(password), employeeId);
        return employee;
    }


}
