package com.company.myUtils;

import java.util.Scanner;

public class parArrayUtils {
    static Scanner in = new Scanner(System.in);

    public static void parPrintVect(int[] ...args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public static void parPrintVectTable(String[] ...args) {
        for (int i = 0; i < args[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < args.length; j++) {
                System.out.print(args[j][i] + " | ");
            }
            System.out.println("]");
        }
    }
}
