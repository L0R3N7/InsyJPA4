package at.htl.workload.customer.logic;

import at.htl.model.CustomerDTO;
import at.htl.workload.customer.Customer;
import at.htl.workload.pc.PC;
import at.htl.workload.pc.logic.PCRepo;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    private final PCRepo pcRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo, PCRepo pcRepo) {
        this.customerRepo = customerRepo;
        this.pcRepo = pcRepo;
    }

    @Override
    @Transactional
    public Customer add(CustomerDTO customerDTO) {
        Customer customer = Customer.create(customerDTO);
        customerRepo.persist(customer);
        return customer;
    }

    @Override
    @Transactional
    public boolean addPcToCustomer(long customerId, long pcId) {
        Customer customer = customerRepo.findById(customerId);
        PC pc = pcRepo.findById(pcId);

        if (customer == null || pc == null || pc.getCustomer() != null){
            return false;
        }

        pc.setCustomer(customer);
        pcRepo.getEntityManager().merge(pc);

        return true;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return this.customerRepo.listAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return this.customerRepo.findById(id);
    }
}
