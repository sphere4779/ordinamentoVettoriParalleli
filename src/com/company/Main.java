package com.company;

import java.io.*;
import java.util.*;
import java.lang.*;
import com.company.myUtils.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static identity id = new identity();


    public static void main(String[] args) {
        //dichiaro variabili e vettori
        char check;
        //chiedo se l'utente vuole riempire i voti da sè e eseguo il codice necessario
        System.out.println("vuoi riempire manualmente il vettore dei voti? s/n");
        check = in.next().charAt(0);
        if (check == 's')
            functions.manualInsert(id.cognomi, id.nomi, id.votiInfo);
        //ordinamento dei vettori in base al voto e in modo crescente
        functions.parBubbleSort(id.cognomi, id.nomi, id.votiInfo);
        functions.printParVect(id.cognomi, id.nomi, id.votiInfo);
    }
}

class identity {
    String[] cognomi = {
            "Antico", "Ardizio", "Bandini", "Benessahraoui", "Bevilacqua",
            "Carretti", "Costantini", "Di Castri", "Fezzardi", "Giglio",
            "Gilardi", "Hakim", "Lattanzi", "Merola", "Pantaleo",
            "Parinetti", "Petringa", "Pinto De Souza", "Piralla", "Popa",
            "Ricciardi", "Sif", "Zanchin"};
    String[] nomi = {
            "Iuri", "Daniele", "Manuel", "Mounir", "Lucia",
            "Caloggero", "Alessandro", "Andrea", "Riccardo", "Cesare",
            "Sara", "Yassminà", "Federico", "Francesco", "Sara",
            "Emanuele", "Marco", "Cristian", "Alex Valentino", "Vitalie",
            "Andrea Ruben", "Ivan", "Marco"};
    String[] votiInfo = {
            "45/100", "50/100", "55/100", "60/100", "65/100",
            "70/100", "75/100", "80/100", "85/100", "90/100",
            "95/100", "100/100", "50/100", "55/100", "60/100",
            "65/100", "70/100", "75/100", "80/100", "85/100",
            "90/100", "95/100", "100/100"};
}
//fin