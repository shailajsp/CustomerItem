package com.sailaja;
import service.CustomerService;
import service.itemService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        service.getAllCustomers();
        service.getCustomerById();
        service.saveCustomer();
        service.updateCustomer();
        service.deleteCustomer();

        itemService itemService = new itemService();
        itemService.getAllItems();
        itemService.saveItem();
        itemService.updateItem();
        itemService.deleteItem();
    }
}