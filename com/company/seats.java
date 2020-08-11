package com.company;

import java.util.Arrays;

public class seats {

    //Array to hold values of seats in either 'E' or 'X'
    private static char[][] seatsArr = new char[5][6];

    //Initializing array of first row of letters A-F
    protected static final char[] col = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};

    int inputRow;
    char inputCol;

    //Constructor initialises var row-col on which cell to be marked 'X'
    seats(int inputRow, char inputCol) {
        this.inputRow = inputRow;
        this.inputCol = inputCol;
    }

    public static void initialize() {
        //populating seats array with char 'E'
        for(char[] arr: seatsArr)
            Arrays.fill(arr,'E');
    }
    public static void display() {
        System.out.println("\n\tSeat Reservation Table");
        System.out.println("*********************************");
        //var to increment for first column of 1-5
        int m=0; //Resetting value on every fn call

        //Display A-F
        for(int a=0;a<6;a++) {
            System.out.print("\t" + col[a]);
        }

        System.out.println();

        //Display Table
        for(int i=0;i<5;i++) {
            m+=1;
            System.out.print(m); //Display 1-5 column
            for(int j=0; j<6; j++) {
                System.out.print("\t" + seatsArr[i][j]);
            }
            System.out.println();
        }
    }

    public void markX() {
        for(int i=0;i<5;i++) {
            for(int j=0; j<6; j++) {
                if(inputCol == col[j]) {
//                    if(seatsArr[inputRow-1][j]=='X') {
//                        System.out.println("Seat is taken");
//                        display();
//                        break;
//                    }
                    seatsArr[inputRow-1][j] = 'X'; //Marks 'X' on specified row-col
                }
            }
        }
        display();
    }

    public int getInputRow() {
        return inputRow;
    }

    public char getInputCol() {
        return inputCol;
    }
}
