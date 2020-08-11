package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class mainapp {

    public static void main(String[] args) {
        //Variables to store row,col input to mark 'X'
        int row = 0;
        char col = 0;
        char ans; //takes yes, no input
        double bill=0;
        boolean exit=false;
        Scanner in = new Scanner(System.in);

        //Initialzing table then display
        seats.initialize();
        seats.display();
        maintee.initializeSeats();

        do {
            //INPUTS: Taking rows input from user with numeric/limit validation
            System.out.println("Enter the row number, Insert only values from 1 to 5 ");
            while (!in.hasNextInt()) {
                out.println("Invalid! Please enter integers b/w 1-5 only. Enter again.");
                in.next();
                if (in.hasNextInt()) {
                    break;
                }
                //(this >=1 && in.nextInt() <=5)
            }
            row = in.nextInt();

            //Taking A-F character input from user with validation
            System.out.println("Enter the col by entering letters A to F ");
            while (!in.hasNext("[A-Fa-f]*")) {
                out.println("Invalid! Please enter letters only. Enter again.");
                in.next();
                if (in.hasNext("[A-Fa-f]*"))
                    break;
            }
            col = in.next().charAt(0);

            //Defining seats object and initializing constrcutor
//Added some random comments
            //Added some more new content


            //Occupied line 50
            maintee mseat= new maintee(row,col);
            regular rseat = new regular(row, col);
            mseat.markX();

            out.println("You have purchased " + mseat.getMainteeSeats() +" mantinee seat/s");
            out.println("You have purchased " + rseat.getRegularSeats() +" regular seat/s");
            bill += mseat.getPrice() + rseat.getPrice();
            out.println(mseat.getPrice());
            out.println(rseat.getPrice());
            out.println("Your total bill is " + bill);

            out.println("Do you want to make more reservations? Type Y for yes and N for n");
            ans = in.next().charAt(0);
            if(ans == 'Y' || ans == 'y') {
                exit = false;
            }
            else if (ans == 'N' || ans == 'n')
                exit=true;
        } while (!exit);

        thank_you thankyou = new thank_you() {
            @Override
            public void display() {
                //To print upper part of the arrow
                for(int i = 0; i < 4; i++) {
                    System.out.println();
                    for (int j = 0; j < i; j++) {
                        System.out.printf("Thank You");
                    }
                }
//        To print lower part of arrow
                for(int i = 4; i > 0; i--) {
                    System.out.println();
                    for (int j = 0; j < i; j++) {
                        System.out.printf("Thank you");
                    }
                }
            }
        };
        thankyou.display();
    }
}
