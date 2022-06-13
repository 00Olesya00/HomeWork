package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tic_tac_toe {
    private static final char DOT_EMPTY = '☺';
    private static final char human = 'X';
    private static final char k = '0';
    private static final int SIZE = 3;
    private static char[][] ars = new char[SIZE][SIZE];
    private static final String HEDER_FIRST_SYMVOL = "♣";
    private static final String SPACE_MAP = " ";
    private static Scanner str = new Scanner(System.in);
    private static Random random = new Random();
    private static int turnsCount = 0;


    public static void GoGame() {
        System.out.printf("\n\n ИГРА НАЧИНАЕТСЯ!");
        do {
            iNit();

        PrintMap();
        playGame();
        }while (InContinueGame());
        EndGame();
    }




    private static void iNit() {
        ArrayInitialization();
        turnsCount = 0;
    }

    private static void ArrayInitialization() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                ars[i][j] = DOT_EMPTY;

            }
        }
    }

    private static void PrintMap() {

        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEDER_FIRST_SYMVOL + SPACE_MAP );
        for (int i = 0; i < SIZE ; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }


    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(ars[i][j] + SPACE_MAP );
            }
            System.out.println();

        }
    }
    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }
    private static void playGame() {
        while (true) {
            human_Turn();
            PrintMap();
            if (checkEnd(human)) {
                break;
            }

            ai_Turn();
            PrintMap();
            if (checkEnd(k)) {
                break;
            }
        }
    }



    private static void human_Turn() {

            System.out.println("ХОД ЧЕЛОВЕКА!");
            int horizontalNumber;
            int verticalNumber;
        while (true) {
            System.out.print("Введите координату по горизонтали: ");
            horizontalNumber = str.nextInt() - 1;
            System.out.print("Введите координату по вертикали: ");
            verticalNumber = str.nextInt() - 1;

            if (isCellFree(horizontalNumber, verticalNumber))  {
                break;
            }
            System.out.printf("Ячейка с координатами: %d:%d уже занята%n%n", horizontalNumber + 1, verticalNumber + 1);
        }
            ars[horizontalNumber][verticalNumber] = human;
        turnsCount++;
        }

    private static boolean isCellFree(int horizontalNumber, int verticalNumber ) {
        return ars[horizontalNumber][verticalNumber] == DOT_EMPTY;

    }

    private static void ai_Turn() {
        System.out.println("ХОД КОМПЬЮТЕРА!");

        int horizontalNumber;
        int verticalNumber;
        do {
        horizontalNumber = random.nextInt(SIZE);
        verticalNumber = random.nextInt(SIZE);
        }while (! isCellFree(horizontalNumber, verticalNumber));
    ars[horizontalNumber][verticalNumber] = k;
        turnsCount++;
    }
    private static boolean checkEnd(char symbol) {

        if (checkWin(symbol)) {
            if (symbol == human ) {
                System.out.println("УРА! ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("ВОССТАНИЕ БЛИЗКО... ИИ ПОБЕДИЛ...");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }

        return false;
    }

    private static boolean checkWin(char symbol) {
//        if (ars[0][0] == symbol && ars[0][1] == symbol && ars[0][2] == symbol) {
//            return true;
//        }
//        if (ars[1][0] == symbol && ars[1][1] == symbol && ars[1][2] == symbol) {
//            return true;
//        }
//        if (ars[2][0] == symbol && ars[2][1] == symbol && ars[2][2] == symbol) {
//            return true;
//        }
//
//        if (ars[0][0] == symbol &&ars[1][0] == symbol && ars[2][0] == symbol) {
//            return true;
//        }
//        if (ars[0][1] == symbol &&ars[1][1] == symbol &&ars[2][1] == symbol) {
//            return true;
//        }
//        if (ars[0][2] == symbol &&ars[1][2] == symbol && ars[2][2] == symbol) {
//            return true;
//        }
//
//        if (ars[0][0] == symbol && ars[1][1] == symbol && ars[2][2] == symbol) {
//            return true;
//        }
//        if (ars[0][2] == symbol && ars[1][1] == symbol && ars[2][0] == symbol) {
//            return true;
//        }
//
//        return false;
//    }
        /** Проверяем горизонтальные и вертикальные линии */
            boolean cols, rows;
            for (int col=0; col<SIZE; col++) {
                cols = true;
                rows = true;
                for (int row=0; row<SIZE; row++) {
                    cols &= (ars[col][row] == symbol);
                    rows &= (ars[row][col] == symbol);
                }
                if (cols || rows) return true;
            }

            return false;
        }

    private static boolean checkDraw() {
/*        for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;*/

        return turnsCount >= SIZE * SIZE;
    }
    private static boolean InContinueGame() {
        System.out.println("Хотите продолжить? да\\нет");
        return switch (str.next()){
            case "Да", "ok","ОК","yes","+","д"-> true;
            default -> false;
        };
    }
    private static void EndGame() {
        str.close();
        System.out.println("В общем все! Ну, ты захэоди!");
    }
}






