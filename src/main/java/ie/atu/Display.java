package ie.atu;
import java.util.Scanner;
public class Display {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("Please enter your address ");
        String address = input.nextLine();

        System.out.println("Please enter your telephone number");
        String tele_number = input.nextLine();

        System.out.println("Please enter your customer number");
        String customernumber = input.nextLine();

        System.out.println("Would you like to enter our mailing list");
        boolean mailinglist = input.nextBoolean();


        Customer Customer1 = new Customer(name,address,tele_number,mailinglist,customernumber);
        System.out.println(customernumber);


    }
}

