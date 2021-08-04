package com.mycompany.clase4;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double i, cambio, limite, temporal, intercambio;
        cambio = 0;
        intercambio = 1;
        System.out.println("Digite hasta donde desea la sucesión");
        limite = entrada.nextDouble();
        System.out.println("-------------------------------------");
        for (i = 0; i < limite; i++) {
            System.out.println((int) cambio);
            temporal = intercambio + cambio;
            cambio = intercambio;
            intercambio = temporal;
        }
    }
}
