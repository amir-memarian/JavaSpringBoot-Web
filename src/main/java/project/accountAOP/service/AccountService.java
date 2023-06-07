package project.accountAOP.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public void displayBalance(String accNum)
    {
        System.out.println("Inside displayBalance() method");
        if(accNum.equals("12345"))
        {
            System.out.println("Total balance: 10,000");
        }
        else
        {
            System.out.println("Sorry! wrong account number.");
        }
    }
}
