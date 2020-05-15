package com.company;

import java.util.Scanner;

public class functions {
    static Scanner in = new Scanner(System.in);

    public static void parBubbleSort(String[] cognomi, String[] nomi, String[] voti) {
        //variabili
        int y;
        int buffer0, buffer1;
        String temp;
        boolean scambi = false;
        //bubblesort che ordina 3 vettori paralleli
        do {
            scambi = false;
            for (y = 0; y < Main.dim - 1; y++) {
                //trasformo i parametri necessari per il bubblesort in interi per semplificare il if
                buffer0 = Integer.parseInt(voti[y].substring(0, voti[y].indexOf('/')));
                buffer1 = Integer.parseInt(voti[y + 1].substring(0, voti[y + 1].indexOf('/')));
                if (buffer0 <  buffer1) {
                    scambi = true;
                    //scambia vettore 1 - cognomi
                    temp = cognomi[y];
                    cognomi[y] = cognomi[y + 1];
                    cognomi[y + 1] = temp;
                    // scambia vettore 2 - nomi
                    temp = nomi[y];
                    nomi[y] = nomi[y + 1];
                    nomi[y + 1] = temp;
                    // scambia vettore 3 - voti
                    temp = voti[y];
                    voti[y] = voti[y + 1];
                    voti[y + 1] = temp;
                }
            }
        } while (scambi == true);
    }

    public static void printVectTable(String[]... args) { //non usato
        for (int i = 0; i < args[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < args.length; j++) {
                System.out.print(args[j][i] + " | ");
            }
            System.out.println("]");
        }
    }

    public static void printParVect(String[] cognomi, String[] nomi, String[] voti) { //stampa i tre vettori allo stesso indice ogni ciclo e crea una specie di tabella

        for (int i = 0; i < Main.dim; i++) {
            System.out.print("[ ");
            System.out.print(cognomi[i] + " | ");
            System.out.print(nomi[i] + " | ");
            System.out.print(voti[i] + " | ");
            System.out.println("]");
        }
    }

    public static void manualInsert(String[] cognomi, String[] nomi, String[] voti) { //per inserire i voti manualmente
        int buffer;
        for (int i = 0; i < Main.dim; i++) {
            do { //prima di inserire il nuovo valore nel vettore uso una variabile buffer per controllare se il numero inserito è nel range di numeri accettabili
                System.out.println("inserire il voto per " + cognomi[i] + " " + nomi[i]);
                buffer = in.nextInt();
            } while (buffer > 100 || buffer < 0);
            voti[i] = String.valueOf(buffer + "/100");
        }
    }
}
//fin