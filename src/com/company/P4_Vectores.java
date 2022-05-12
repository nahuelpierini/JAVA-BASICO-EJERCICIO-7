package com.company;

import java.util.Vector;

public class P4_Vectores {
    /*
    Si quiero crear un vector de 1000 elementos, por defecto cuando se sobrepase al aniadir
    otro elemeto este se duplicara automaticamente mas grande a los elementos aniadidos.
    Este proceso conlleva que gaste mucha memoria y se relentice el proceso.
    para ellos podemos modificar de entrada la capacidad del vector asi cuando se aniade
    un elemento no se tenga que duplicar.
     */
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(1000,50);
    }

    /*
    TENEMOS UNA CAPACIDAD INICIAL DEL VECTOR DE 1000 ELEMENTOS Y CUANDO LO SOBREPASE
    SE INCREMENTARIA 50 ELEMENTOS MAS EL VALOR INICIAL; Y ASI SUCESIVAMENTE.
     */
}
