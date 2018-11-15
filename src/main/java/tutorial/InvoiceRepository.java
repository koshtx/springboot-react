package tutorial;

import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<User, Long> {

}
