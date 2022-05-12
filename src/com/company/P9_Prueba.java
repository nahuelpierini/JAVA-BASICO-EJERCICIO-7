package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P9_Prueba {
    public static void main(String[] args) {
        //arrayList();
        ListaDeTelefono();



    }

    public static void arrayList(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("       ARRAY       ");
        System.out.println("Ingrese numero de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingrese numero de columnas: ");
        int columnas = scanner.nextInt();

      int array[][] = new int[filas][columnas];

      for (int i=0;i<filas; i++){

          for (int j=0; j<columnas; j++){
              System.out.print("Array" + "[" + i + "][" + j + "] : "   );
              array[i][j]=scanner.nextInt();
              System.out.println();

          }

      }

      for (int i=0;i<array.length; i++){

            for (int j=0; j<array[i].length; j++){

                System.out.print(array[i][j]);


            }
             System.out.println();

        }




    }

    public static void ListaDeTelefono(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("           AGENDA           ");
        try {

            System.out.println("Cuantos contactos desea agregar? ");
            int numeroDeContactosTotal = scanner.nextInt();
            int i = 1;
            int numeroTelefono;
            String nombre;
            HashMap<String, Integer> agenda = new HashMap<String, Integer>();


                do {


                    Scanner scanner1 = new Scanner(System.in);

                    System.out.println((i) + " Nombre");
                    nombre = scanner1.nextLine();
                    System.out.println((i) + " Telefono: ");
                    numeroTelefono = scanner1.nextInt();
                    agenda.put(nombre, numeroTelefono);

                    i++;
                } while (i < numeroDeContactosTotal);

                 System.out.println();
                System.out.println(agenda);
        }catch(Exception e){
                System.out.println("Agregue correctamente numeros y nombres " + e.getMessage());
        }



    }
}
