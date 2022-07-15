package com.sapo.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    Atm  bidvAtm = new BidvAtm();
//    @Autowired
//    private Customer customer;
    @Autowired
    @Qualifier("printerFile")
    private Printer printer;
    Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer("ABC", "1234", new BigDecimal(5000000));
        printer.printMessage("MENU:");
        printer.printMessage("1:Rút tiền");
        printer.printMessage("2:Nạp tiền");
        int action = scanner.nextInt();
        BigDecimal money = scanner.nextBigDecimal();
        switch (action){
            case 1:

                bidvAtm.withDraw(customer, money);
                bidvAtm.printCurrentMoney();
            break;

            case 2:
                bidvAtm.deposit(customer, money);
                bidvAtm.printCurrentMoney();
                break;
            default:
                printer.printMessage("Mời nhập lại");


        }


        //Demo function

//        bidvAtm.withDraw(customer, new BigDecimal(200000));
//        bidvAtm.printCurrentMoney();
//        bidvAtm.withDraw(customer, new BigDecimal(10000000));
//        bidvAtm.printCurrentMoney();
//        bidvAtm.deposit(customer,new BigDecimal(1000000));
//        bidvAtm.printCurrentMoney();

    }
}
