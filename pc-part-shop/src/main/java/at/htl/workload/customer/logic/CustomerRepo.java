package at.htl.workload.customer.logic;

import at.htl.workload.customer.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface CustomerRepo extends PanacheRepository<Customer> {

}
