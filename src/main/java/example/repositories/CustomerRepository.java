package example.repositories;

/**
 * Created by aaronburrell on 9/20/15.
 */
import java.util.List;

import example.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}