package com.company;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class P8_InputOutputStream {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("D:\\fileIn.txt");
            byte[] datos = fichero.readAllBytes();
            for (int dato : datos)
            System.out.print((char)dato);
            System.out.println();
            fichero.close();

            PrintStream fichero2 = new PrintStream("D:\\fileOut.txt");
            fichero2.write(datos);
            fichero2.close();




        }catch (Exception e){
            System.out.println("Fichero no existe" + e.getMessage());
        }



    }
}
