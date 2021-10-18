package com.przemyslawrutkowski;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(234151);
        timsPhone.powerOn();
        timsPhone.callPhone(24142);
        timsPhone.answer();
    }
}
