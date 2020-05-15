package com.company;

import java.io.*;
import java.util.*;
import java.lang.*;
import com.company.myUtils.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public final static int dim = 23;

    public static void main(String[] args) {
        //dichiaro variabili e vettori
        char check;
        String[] cognomi = new String[dim];
        String[] nomi = new String[dim];
        String[] votiInfo = new String[dim];
        //riempitura con i nomi e cognomi e dei voti
        classFiller(cognomi, nomi, votiInfo);
        //chiedo se l'utente vuole riempire i voti da sè e eseguo il codice necessario
        System.out.println("vuoi riempire manualmente il vettore dei voti? s/n");
        check = in.next().charAt(0);
        if (check == 's')
            functions.manualInsert(cognomi, nomi, votiInfo);
        //ordinamento dei vettori in base al voto e in modo crescente
        functions.parBubbleSort(cognomi, nomi, votiInfo);
        functions.printParVect(cognomi, nomi, votiInfo);
        /* roba per dei test
        System.out.println("100/100".hashCode());
        System.out.println("0/100".hashCode());
        System.out.println("-1/100".hashCode());*/
    }

    public static void classFiller(String[] cognomi, String[] nomi, String[] votiInfo) {
        cognomi[0] = "Antico";
        nomi[0] = "Iuri";
        votiInfo[0] = "45/100";//
        cognomi[1] = "Ardizio";
        nomi[1] = "Daniele";
        votiInfo[1] = "50/100";//
        cognomi[2] = "Bandini";
        nomi[2] = "Manuel";
        votiInfo[2] = "55/100";//
        cognomi[3] = "Benessahraoui";
        nomi[3] = "Mounir";
        votiInfo[3] = "60/100";//
        cognomi[4] = "Bevilacqua";
        nomi[4] = "Lucia";
        votiInfo[4] = "65/100";//
        cognomi[5] = "Carretti";
        nomi[5] = "Caloggero";
        votiInfo[5] = "70/100";//
        cognomi[6] = "Costantini";
        nomi[6] = "Alessandro";
        votiInfo[6] = "75/100";//
        cognomi[7] = "Di Castri";
        nomi[7] = "Andrea";
        votiInfo[7] = "80/100";//
        cognomi[8] = "Fezzardi";
        nomi[8] = "Riccardo";
        votiInfo[8] = "85/100";//
        cognomi[9] = "Giglio";
        nomi[9] = "Cesare";
        votiInfo[9] = "90/100";//
        cognomi[10] = "Gilardi";
        nomi[10] = "Sara";
        votiInfo[10] = "95/100";//
        cognomi[11] = "Hakim";
        nomi[11] = "Yassminà";
        votiInfo[11] = "100/100";//
        cognomi[12] = "Lattanzi";
        nomi[12] = "Federico";
        votiInfo[12] = "50/100";//
        cognomi[13] = "Merola";
        nomi[13] = "Francesco";
        votiInfo[13] = "55/100";//
        cognomi[14] = "Pantaleo";
        nomi[14] = "Sara";
        votiInfo[14] = "60/100";//
        cognomi[15] = "Parinetti";
        nomi[15] = "Emanuele";
        votiInfo[15] = "65/100";//
        cognomi[16] = "Petringa";
        nomi[16] = "Marco";
        votiInfo[16] = "70/100";//
        cognomi[17] = "Pinto De Souza";
        nomi[17] = "Cristian";
        votiInfo[17] = "75/100";//
        cognomi[18] = "Piralla";
        nomi[18] = "Alex Valentino";
        votiInfo[18] = "80/100";//
        cognomi[19] = "Popa";
        nomi[19] = "Vitalie";
        votiInfo[19] = "85/100";//
        cognomi[20] = "Ricciardi";
        nomi[20] = "Andrea Ruben";
        votiInfo[20] = "90/100";//
        cognomi[21] = "Sif";
        nomi[21] = "Ivan";
        votiInfo[21] = "95/100";//
        cognomi[22] = "Zanchin";
        nomi[22] = "Marco";
        votiInfo[22] = "100/100";//
    }
}
//fin