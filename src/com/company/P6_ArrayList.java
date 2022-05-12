package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_ArrayList {
    public static void main(String[] args) {

        ingresarNumeros();

    }

    public static void ingresarNumeros(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 Numeros del 1 al 10: ");
        int i=0;
        while (i<10){
            int numero = scanner.nextInt();
            arrayList.add(numero);
            i++;
        }
        System.out.println(arrayList);

        for (int j=arrayList.size()-1; j>=0;j--){
            int resultado = arrayList.get(j) % 2;
            if (resultado ==0){
                arrayList.remove(j);
            }
        }
        System.out.println(arrayList);
    }

}


