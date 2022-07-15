package com.sapo.edu.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PrinterFile implements Printer
{
    Logger logger= LoggerFactory.getLogger("app.log");
    @Override
    public void printCustomer(Customer customer) {
        logger.info("CustomerId: " + customer.getAcctNo() + ", balance: " + customer.getBalance().toString());
    }

    @Override
    public void printMessage(String message) {
        logger.info(message);

    }
}
