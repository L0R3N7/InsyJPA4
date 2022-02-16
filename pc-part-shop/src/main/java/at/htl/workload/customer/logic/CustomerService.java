package at.htl.workload.customer.logic;

import at.htl.model.CustomerDTO;
import at.htl.workload.customer.Customer;

import java.util.List;

public interface CustomerService {

    Customer add(CustomerDTO customerDTO);

    boolean addPcToCustomer(long customerId, long pcId);

    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);
}
