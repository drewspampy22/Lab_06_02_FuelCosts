import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double Gallons = 0;
        double FuelEfficency = 0;
        double GasPrice = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Input Number of gallons in your tank");
                if (in.hasNextDouble())
                {
                    Gallons = in.nextInt();
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("What is your fuel efficency? (miles per gallon) ");
                        if (in2.hasNextDouble())
                        {
                            FuelEfficency = in2.nextDouble();
                            Scanner in3 = new Scanner(System.in);
                            System.out.println("What is price of gas per gallon?");

                                if (in3.hasNextDouble())
                                {
                                    GasPrice = in3.nextDouble();
                                        System.out.println("It will cost you " + ((100/FuelEfficency) * GasPrice) + " to make it a 100 miles");
                                        System.out.println("You will travel " + (Gallons*FuelEfficency) + " miles with whats in your tank currently");


                                }
                                else
                                {
                                    System.out.println("Invalid input please try again");
                                }
                        }
                        else
                        {
                            System.out.println("Invalid input please try again");
                        }

                }
                else
                {
                    System.out.println("Invalid input please try again");
                }
        }
}