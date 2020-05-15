package com.company.myUtils;

import java.util.*;
import java.lang.*;

public class arrayUtils {
    static Scanner in = new Scanner(System.in);

    public static void vectFiller(double[] arr, double filler) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = filler;
        }
    }

    public static void vect0123(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void printVect(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void vectRandomFill(int[] array, int bound) {
        Random randNum = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(bound);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                //Se l' elemento j e maggiore del successivo allora scambiamo i valori
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                    flag = true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            if (!flag)
                break;
			/*Se flag=false allora vuol dire che nell' ultima iterazione
			non ci sono stati scambi, quindi il metodo può terminare
			poiché l' array risulta ordinato*/
        }
    }

    public static void invBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                //Se l' elemento j e maggiore del successivo allora scambiamo i valori
                if (array[j] < array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                    flag = true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            if (!flag)
                break;
				/*Se flag=false allora vuol dire che nell' ultima iterazione
				non ci sono stati scambi, quindi il metodo può terminare
				poiché l' array risulta ordinato*/
        }
    }

    public static void insertSort(int[] array) {
        double num;
        int x;
        int pos;
        int[] array2 = new int[array.length];
        for (x = 0; x < array2.length; x++) // zeroing vector
            array2[x] = 0;
        //start of the algorithm
        for (x = 0; x < array2.length; x++) {
            num = array[x]; // nuovo numero
            pos = 0;
            while ((array2[pos] < num) && (array2[pos] != 0))
                pos++;           // trova il posto per inserimento
            shiftR(array2, pos);       // crea un buco dove inserire
            array2[pos] = (int) num;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
    }

    public static void shiftR(int[] array, int hole) {
        int x;
        for (x = array.length - 2; x >= hole; x--) {   // sposta a destra
            array[x + 1] = array[x];        // posto libero in buco
        }
    }

    public static void seleSort(int[] array) {
        int x, y, i_min;
        int temp;
        for (x = 0; x < array.length - 1; x++) {  // ricerca del minimo
            i_min = x;                           // hp primo come minimo
            for (y = x + 1; y < array.length; y++) { // x la parte dx del vettore
                if (array[y] < array[i_min])        // se l'elemento � minore
                    i_min = y;                     // indice nuovo minimo
            }
            // scambia elemento corrente con il minore trovato
            temp = array[i_min];
            array[i_min] = array[x];
            array[x] = temp;
        }
    }

    public static void countingSort(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int i = 1;
        for (; i < arr.length; i++) { //Calcolo degli elementi max e min
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }
        int[] arr2 = new int[max - min + 1];
        for (i = 0; i < arr2.length; i++)
            arr2[i] = 0; //inizializza a zero gli elementi di C
        for (i = 0; i < arr.length; i++)
            arr2[(int) (arr[i] - min)]++;  //aumenta il numero di volte che si è incontrato il valore
        //Ordinamento in base al contenuto dell'array delle frequenze C
        int k = 0; //indice per l'array A
        for (i = 0; i < arr2.length; i++) {
            while (arr2[i] > 0) { //scrive C[i] volte il valore (i+min) nell'array arr
                arr[k] = i + min;
                k++;
                arr2[i]--;
            }
        }
    }

    public static int findMin(int[] vet) {
        int x, num1;
        num1 = vet[0];         // inzializzo il min
        for (x = 0; x < vet.length; x++)
            if (vet[x] < num1)
                num1 = vet[x];     // il minore
        return num1;
    }

    public static int findMax(int[] vet) {
        int x, num2;
        num2 = vet[0];         // inzializzo il max
        for (x = 0; x < vet.length; x++)
            if (vet[x] > num2)
                num2 = vet[x];     // il maggiore
        return num2;
    }

    public static void quick_sort(int[] vett, int e_sx, int e_dx){
        int q;                        // nuovo indice  pivot
        if (e_sx < e_dx){             // ctr termine vettore
            q = partition(vett, e_sx, e_dx);
            // -- chiamata sui sotto vettori sinistro e destro
            quick_sort(vett, e_sx, q - 1);  // vet di sinistra
            quick_sort(vett, q + 1, e_dx);  // vet di destra
        }
    }

    public static int partition(int[] vett, int sx, int dx){
        int pivot, ipivot;                        // valore di pivot, indice posizione pivot
        ipivot = sx;                              // scegli indice per il pivot: Hoare usa il primo
        pivot = vett[ipivot];                     // valore_pivot <- [posizione_iniziale_pivot]
        // effettua il partizionamento in due sotto vettori individuando q (posizione_effettiva_pivot)
        while(sx < dx){
            while((vett[sx] <= pivot) && (sx < dx)) // cerco elemento di sinistra > pivot
                sx++;
            while(vett[dx] > pivot)                 // cerco elemento di destra < pivot
                dx--;
            if(sx < dx){                            // se non ho finito di ordinare
                swap(vett, sx, dx);                // scambio i due elementi
            }
        }
        swap(vett, ipivot, dx);                // posiziona il pivot nella sua cella q
        return dx;
    }

    public static void swap(int[] vet, int x, int y) {
        int tmp = vet[x];
        vet[x] = vet[y];
        vet[y] = tmp;
    }
}
//fin