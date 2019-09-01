package com.template.customer;

import com.template.customer.customer.Customer;
import com.template.customer.report.ComplexReportGenerator;
import com.template.customer.report.ReportGenerator;
import com.template.customer.report.SimpleReportGenerator;

import java.util.Arrays;
import java.util.List;

public class CustomerMain {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("홍길동1", 101), new Customer("장충재1", 132), new Customer("김영희1", 99),
                new Customer("홍길동2", 77), new Customer("장충재2", 22), new Customer("김영희2", 999),
                new Customer("홍길동3", 32), new Customer("장충재3", 55), new Customer("김영희3", 433),
                new Customer("홍길동4", 1232), new Customer("장충재4", 32), new Customer("김영희4", 23));

        ReportGenerator complexGenerator = new ComplexReportGenerator(customerList);
        ReportGenerator simpleGenerator = new SimpleReportGenerator(customerList);

        simpleGenerator.makeReport();
        complexGenerator.makeReport();



    }
}
