package template.customer.report;

import com.template.customer.customer.Customer;

import java.util.List;

public abstract class ReportGenerator {

    List<Customer> customerList;

    public ReportGenerator(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public final void makeReport() {
        printCostomerCount();
        printCostomerInfo();
    }
    void addCustomer(Customer customer) {
        customerList.add(customer);
    }
    abstract void printCostomerCount();
    abstract void printCostomerInfo();


}
