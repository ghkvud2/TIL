package com.template.customer.report;

import com.template.customer.customer.Customer;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

    public ComplexReportGenerator(List<Customer> customerList) {
        super(customerList);
    }

    @Override
    void printCostomerCount() {
        long count = customerList.stream().filter(customer -> customer.getScore() >= 100).count();
        System.out.println("고객의 수는 " + count + "명입니다.");
    }

    @Override
    void printCostomerInfo() {
        customerList.stream().filter(customer -> customer.getScore() >= 100)
                .forEach(System.out::println);
    }
}
