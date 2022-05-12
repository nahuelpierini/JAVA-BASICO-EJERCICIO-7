package com.company;

public class P2_ArrayBidimensional {
    public static void main(String[] args) {
        int arrayBidi[][] = {
                {1,2,3,4,5},
                {6,7,8,9,0},
        };

        for (int i=0;i<arrayBidi.length;i++){
            for (int j=0; j<arrayBidi[i].length; j++){
                System.out.println("El valor del array:  " + arrayBidi[i][j] + " tiene la posicion: " + i + j );
            }


        }




    }
}
