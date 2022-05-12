package com.company;

import java.util.Scanner;

public class P7_Excepciones {

    public static void main(String[] args) {

        try {
            DividePorCero();

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }


    }

    public static int DividePorCero() throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Ingrese numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        numero2 = scanner.nextInt();
        try {
            resultado= numero1/numero2;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }

        return resultado;

    }
}

