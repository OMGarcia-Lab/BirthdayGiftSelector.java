import java.util.Scanner;

public class BirthdayGiftSelector {
    public static void main(String[] args) {
        // Any time you want to use user input, import Scanner!!! //
        // Import Scanner, it can be whenever but I prefer having it at the beginning //
        Scanner sc = new Scanner(System.in);

        int a1;
        String a2;
        // making it a string message let's you declare it once and not worry about making more identifiers for it //

        System.out.println("How much would you like to spend on a gift?: ");
        a1 = sc.nextInt();
        a2 = sc.nextLine();
        // making it a .nextLine means a2 will be the users 2nd input, not the first! //

       // If a1 is more than 0 AND is less than 10 //
        if (0 < a1 && a1 < 10) {
            System.out.println("Which kind of gift would you like to buy? \nEnter one of the following (Electronics/Clothes/Book/Gift Card)");
            a2 = sc.nextLine().toLowerCase();
            // Adding a .toLowerCase now lets the user not worry about capitol sensitivity //
            // Now the user doesn't need to capitlaize the words //
            if (a2.equals("electronics")) {
                System.out.println("You could give a phone charger!");
            // else if let's you continue the loop with more if conditions //
            } else if (a2.equals("clothes")) {
                System.out.println("You could give a Giants Cap!");
            } else if (a2.equals("book")) {
                System.out.println("You could gift a book called 'The Book Thief'!");
            } else if (a2.equals("gift card")) {
                System.out.println("You could gift a giftcard from Starbucks!");
            } else {
                System.out.println("You might have entered the wrong category");
            }
        }

        // Making it an else if continues the conditions of the before if loop //
        // else if a1 is equal to or more than 10 AND less than 30 //
        else if (10 <= a1 && a1 < 30) {
            System.out.println("Which kind of gift would you like to buy? \nEnter one of the following (Electronics/Clothes/Book/Gift Card)");
            a2 = sc.nextLine().toLowerCase();
            if (a2.equals("electronics")) {
                System.out.println("You could give a phone case!");
            } else if (a2.equals("clothes")) {
                System.out.println("You could give a SFSU T-Shirt!");
            } else if (a2.equals("book")) {
                System.out.println("You could gift a book called 'Flowers for Algernon'!");
            } else if (a2.equals("gift card")) {
                System.out.println("You could gift a giftcard from Target!");
            } else {
                System.out.println("You might have entered the wrong category");
            }
        }

        // else if a1 is equal to or more than 30 AND less than 50 //
        else if (30 <= a1 && a1 < 50) {
            System.out.println("Which kind of gift would you like to buy? \nEnter one of the following (Electronics/Clothes/Book/Gift Card)");
            a2 = sc.nextLine().toLowerCase();
            if (a2.equals("electronics")) {
                System.out.println("You could give a phone camera lens!");
            } else if (a2.equals("clothes")) {
                System.out.println("You could give a SFSU Hoodie!");
            } else if (a2.equals("book")) {
                System.out.println("You could gift a book called 'The Lord of the Rings Trilogy'!");
            } else if (a2.equals("gift card")) {
                System.out.println("You could gift a Visa Giftcard!");
            } else {
                System.out.println("You might have entered the wrong category");
            }
        }

        // else if a1 is equal to or more than 50 //
        else if (a1>=50) {
            System.out.println("Instead of a gift, please donate this amount to charity!");
        }

        // Else, for if they put a number that is a decimal or 0 or a negative number //
        else {
            System.out.println("Error");
        }
    }
}
