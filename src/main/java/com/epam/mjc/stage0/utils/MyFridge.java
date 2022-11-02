package com.epam.mjc.stage0.utils;

public class MyFridge implements Fridge{



    public static void main(String[] args) {
        MyFridge myFridge = new MyFridge();

        myFridge.open();
        myFridge.getMilk();
        myFridge.close();

    }

    @Override
    public void close() {
        System.out.println("Close the fridge!");
    }

    @Override
    public void open() {
        System.out.println("Open the fridge!");
    }

    @Override
    public void getMilk() {
        System.out.println("Take the milk!");
    }
}
