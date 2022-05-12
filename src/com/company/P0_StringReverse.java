package com.company;

public class P0_StringReverse {

    public static void main(String[] args) {
        String revers = reverse("Hola mundo");
        System.out.println(revers);

    }

    public static String reverse(String texto){
        String textoReverso="";
        for (int i=texto.length()-1; i>=0; i--){
             textoReverso= textoReverso + texto.charAt(i);
        }
        return textoReverso;
    }

}
