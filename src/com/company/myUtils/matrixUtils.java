package com.company.myUtils;

import java.util.*;
import java.lang.*;

public class matrixUtils {
    static Scanner in = new Scanner(System.in);

    public static void printMatr(int[][] matr) {
        System.out.print("[ ");
        for (int i = 0; i < matr.length; i++)   // Loop through all rows
            for (int j = 0; j < matr[i].length; j++)    // Loop through all elements of current row
                System.out.print(matr[i][j] + " ");
        System.out.println("]");
    }
}
