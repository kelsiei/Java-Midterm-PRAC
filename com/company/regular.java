package com.company;

public class regular extends seats {
    static int regularSeats;
    double price;

    regular(int inputRow, char inputCol) {
        super(inputRow, inputCol);
        setPrice();
    }

    public static void initializeSeats() {
        regularSeats=0;
    }

    public void countRegular() {
        for(int i=1; i<5; i++) {
            for (int j=0;j<6;j++) {
                if(inputRow==i-1 && inputCol == col[j]){
                    regularSeats+=1;
                }
            }
        }
    }

    public void setPrice() {
        countRegular();
        price = 10 * regularSeats;
    }

    public double getPrice() {
        return price;
    }

    public int getRegularSeats() {
        return regularSeats;
    }
}
