package starting;

import java.io.IOException;


public class yee {
    public static void main(String[] args) throws IOException {
        int y = 7;
        int k = 4;
        var pog = (y<=k)?y*k:k-y;

        String myFirstName = "john";
        //this block declares and initializes three variables
        System.out.println(pog);
        System.out.println(myFirstName);
        System.out.println("Do you want to countinue?");

        System.out.println("Enter Y for yes and N for no");

        char userChoice = (char) System.in.read();
        //read user input and store in

        //userChoice character variable

        System.in.read(); //to account for the Enter key
        System.out.println("Yeeee hewo!\nhehe");
        System.out.println(userChoice);
    }
}
