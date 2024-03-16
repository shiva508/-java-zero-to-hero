package com.comrade.arrays.clone;
public class CloningOfArrays {
    public static void main(String[] args) {
        singleDimentional();
        multiDimentional();
    }
    private static void multiDimentional() {
        int[][] multiArray = { { 1, 2 }, { 3, 4 } };
        int[][] cloneArray = multiArray.clone();
        System.out.println(multiArray == cloneArray);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(cloneArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void singleDimentional() {
        int[] intArray = { 1, 3, 4 };
        int[] cloneArray = intArray.clone();
        System.out.println(cloneArray == intArray);
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]);
        }
    }
}
