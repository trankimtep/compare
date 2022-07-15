

package com.sapo.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Scanner;

//@Component


public class Customer {
    @Autowired
    private Printer printer;
    private String acctNo;
    private String pin;
    private BigDecimal balance;



    Scanner scanner = new Scanner(System.in);
    public Customer(String accountNo,String pin,BigDecimal balance) {
        this.acctNo = accountNo;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
//    public  void input(){
//        System.out.println("Moi nhap AcctNo: ");
//        acctNo = scanner.nextLine();
//
//        System.out.println("Moi nhap ma Pin");
//        pin = scanner.nextLine();
//
//        System.out.println("Moi nhap balance");
//        balance = scanner.nextBigDecimal();
//
//    }
//    public void addCustomer() {
//        Customer customer = new Customer();
//        customer.input();
//    }
}

