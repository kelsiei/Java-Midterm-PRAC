package com.company;

public class maintee extends seats {

    static int mainteeSeats;
    double price;
    maintee(int inputRow, char inputCol) {
        super(inputRow, inputCol);
        setPrice();
    }

    public static void initializeSeats() {
        mainteeSeats=0;
    }

    public void countMaintee() {
        //Enter loop only if 1st row entered (Maintee)
        if(inputRow==1) {
            for (int j = 0; j < 6; j++) {
                if (inputCol == col[j])
                    mainteeSeats += 1; //Increment seats if value A-F inputted matches array of 1-Row A-F
            }
        }
    }

    //This fn calls count and then computes price
    public void setPrice() {
        countMaintee();
        price = 20 * mainteeSeats;
    }
    public int getMainteeSeats() {
        return mainteeSeats;
    }

    public double getPrice() {
        return price;
    }
}
