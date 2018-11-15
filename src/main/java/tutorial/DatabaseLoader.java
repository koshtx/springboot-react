package tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;


    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee(58L,"Pedro Perez", 22, 28));
        this.repository.save(new Employee(65L,"Omar Orozco", 24, 18));
        this.repository.save(new Employee(75L, "Uciel Urzua", 23, 22));

    }
}
