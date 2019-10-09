package template.customer.report;

import com.template.customer.customer.Customer;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {

    public SimpleReportGenerator(List<Customer> customerList) {
        super(customerList);
    }

    @Override
    void printCostomerCount() {
        System.out.println("고객의 수는 " + customerList.size() + "명 입니다.");
    }

    @Override
    void printCostomerInfo() {
        customerList.stream()
                .forEach(System.out::println);
    }
}
