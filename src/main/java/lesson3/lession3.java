package lesson3;

import java.util.Arrays;

public class lession3 {
    public static int size = 5;

    public static void main(String[] args) {
        unitArray();
        integerArray();
        multiplArray();
        dualArray();
        broadcasArray(10,7);
        maxMinArray();
        //truFo();(  Не успела, можно доздать?
        //nArray();
    }



    private static void unitArray() {
        System.out.println("Задание №1" + "\n");
        int[] unitArray = {1, 0, 1, 1, 0, 1, 1, 0};
        System.out.println("Изначальный массив: " + Arrays.toString(unitArray));
        for (int i = 0; i < unitArray.length; i++) {
            if (unitArray[i] == 0) {
                unitArray[i] = 1;
            } else {
                unitArray[i] = 0;
            }
        }
        System.out.println("После изменения:    " + Arrays.toString(unitArray));
    }

    private static void integerArray() {
        System.out.println("Задание №2" + "\n");
        int[] integerArray = new int[100];
        //for (int i = 1; i < integerArray.length+1; i++) { // Так можно? или это усложняет код?
        // (integerArray[i -1])+=i;
        for (int i = 0; i < integerArray.length; i++) {
            (integerArray[i]) = i + 1;
        }
        System.out.println("После изменения:    " + Arrays.toString(integerArray));
    }

    private static void multiplArray() {
        System.out.println("Задание №3" + "\n");
        int[] multiplArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Изначальный массив: " + Arrays.toString(multiplArray));
        for (int i = 0; i < multiplArray.length; i++) {
            if (multiplArray[i] < 6) {
                multiplArray[i] *= 2;
            }

        }
        System.out.println("После изменения:   " + Arrays.toString(multiplArray));
    }

    private static void dualArray() {
        System.out.println("Задание №4" + "\n");

        int[][] lArray = new int[size][size];
        String str = "[";
        for (int i = 0; i < lArray.length; i++) {
            for (int j = 0; j < lArray.length; j++) {
                lArray[i][j] = 1;
                str += lArray[i][j];
                if (i != lArray.length && j != lArray.length) {
                    str += ", ";

                }
            }
            str += "]";

        }
        System.out.println(str);
    }

    private static int[] broadcasArray(int len, int initialValue) {
        System.out.println("Задание №5" + "\n");
        int[] bArray = new int[len];
        Arrays.fill(bArray, initialValue);
        return bArray;
    }

    private static void maxMinArray() {
        System.out.println("Задание №6" + "\n");
        int[] myList = {1, 5, 8, 10, 4};
        int max = myList[0];
        int min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            } else if (myList[i] < min) {
                min = myList[i];
            }
        }System.out.println("Min: "+min +" Min: "+max );
    }

    private static void truFo() {
        System.out.println("Задание №7" + "\n");

    }

    private static void nArray() {
        System.out.println("Задание №7" + "\n");
    }
}







//    int[] myList =
//    int temp = myList[0];
//
//for (int i = 1; i < myList.length; i++) {
//        myList[i - 1] = myList[i];
//    }
//
//    myList[myList.length - 1] = temp;



