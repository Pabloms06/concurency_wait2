package com.cbellmont;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        try {
        Cliente cliente = new Cliente();
        Camarero camarero = new Camarero();
        camarero.start();
        cliente.join();
        cliente.start();
        camarero.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
