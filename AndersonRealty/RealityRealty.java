import java.util.Scanner;
import java.util.ArrayList;
/** main class where user puts in the homes database and then properly prints the homes database
 * @author ryana
 */
public class RealityRealty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name of homes database: ");
        ArrayList<Home> homes = HomeReader.readHomesFromFile(scan.next());          // calls the HomeReader class and reads the file
        
        if (homes == null) {                        // if file isnt found nothing will be printed. If file is found then it will be printed in the formatted way
            System.out.println("No file found.");
        } else {
            HomeLister.printHomeList(homes);        // calls the HomeLister class and prints the file in the correct format
        }
        scan.close();
    }
}
