package com.przemyslawrutkowski;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account(); //(654321, 0.00, "Bob Brown", "xxx@gmail.com", "123456789");
//        bobsAccount.depositFunds();
//        bobsAccount.withdrawFunds();
//
//
//        Account przemekAccount = new Account(13123, 24.4, "Tim");
//        System.out.println("Account number = " + przemekAccount.getAccountNumber() + " email = " + przemekAccount.getEmail());

        VipCustomer przemekVip = new VipCustomer("Przemek", 124, "przrut@gmail.com");
        System.out.println(przemekVip.getName());
        VipCustomer johnVip =  new VipCustomer("John", 2123);
        System.out.println(johnVip.getName());
        VipCustomer defaultVip = new VipCustomer();
        System.out.println(defaultVip.getName());
        System.out.println();
    }
}
