package com.example.Banking.Application.controller;

import com.example.Banking.Application.entity.Customer;
import com.example.Banking.Application.service.AccountService;
import com.example.Banking.Application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class CustomerController {

    static String password;

    static Customer defaultCustomer;
    @Autowired
    private CustomerService customerService;

    @Autowired
    private AccountController accountController;

    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }


    @PostMapping("/customer")
    public String createCustomer(Customer customer,HttpServletRequest request){
        Integer id=customer.getAccountID();
        String name=request.getParameter("customerName");
        String phone=request.getParameter("mobileNumber");
        password=request.getParameter("password");
        customer=new Customer(id,name,phone,password);
        customerService.createCustomer(customer);
        accountController.createAccount(customer.getAccountID(),0,"active");
        return "login";
    }




    @PostMapping("/details")
    public String details(HttpServletRequest request, Model model){
        String userName=request.getParameter("username");
        password=request.getParameter("password");
        defaultCustomer=customerService.printCustomerDetails(password);
        if(password.equals(defaultCustomer.getPassword())){
            model.addAttribute("customerName",defaultCustomer.getCustomerName());
            model.addAttribute("phoneNumber",defaultCustomer.getPhoneNumber());
            model.addAttribute("accountID",defaultCustomer.getAccountID());
        }

        return "details";
    }

    @DeleteMapping("/customer/{accountID}")
    public void deleteCustomer(@PathVariable Integer accountID) {
        customerService.deleteCustomer(accountID);
    }

    @GetMapping("/balance")
    public String getBalance( Model model, HttpServletRequest request) {
        Integer accountID=defaultCustomer.getAccountID();
        Integer balance=accountService.getBalance(accountID);
        model.addAttribute("balance",balance);
        return "balance";
    }

//    @RequestMapping("/updateCustomer")
//    public String updateCustomerDetails(HttpServletRequest request,Model model){
//        defaultCustomer.setCustomerName(request.getParameter("customerName"));
//        defaultCustomer.setPassword(request.getParameter("password"));
//        defaultCustomer.setPhoneNumber(request.getParameter("phoneNumber"));
//        customerService.updateCustomer(defaultCustomer);
//        return "updateCustomer";
//    }


    // depositAmount
    @RequestMapping("/deposit")
    public String deposit(){
        return "deposit";
    }


    @PostMapping("/deposit")
    public void depositAmount( HttpServletRequest request) {
        Integer amount=Integer.parseInt(request.getParameter("amount"));
        Integer accountID=defaultCustomer.getAccountID();
        Integer initBal =accountService.getBalance(accountID);
        accountService.depositAmount(accountID, amount);


    }

    // withdrawAmount
    @RequestMapping("/withdraw")
    public String withdraw(){
        return "withdraw";
    }

    @PostMapping("/withdraw")
    public void withdrawAmount(HttpServletRequest request) {
        Integer amount=Integer.parseInt(request.getParameter("amount"));
        Integer accountID=defaultCustomer.getAccountID();
        Integer initBal =accountService.getBalance(accountID);
        accountService.withdrawAmount(accountID, amount);

    }

    // transferAmount
    @RequestMapping("/transfer")
    public String transfer(){
        return "transfer";
    }

    @PostMapping("/transfer")
    public void transferAmount( HttpServletRequest request) {
        Integer accountID =defaultCustomer.getAccountID();
        Integer depositAccountID = Integer.parseInt(request.getParameter("depositAccountID"));
        Integer amount=Integer.parseInt(request.getParameter("amount"));
        accountService.transferAmount(accountID, depositAccountID, amount);

    }


}