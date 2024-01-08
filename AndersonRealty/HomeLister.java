import java.util.ArrayList;
import java.util.Collections;
/** this class lists the correct format of the file
 * @author ryana
 */
public class HomeLister {
    public static void printHomeList(ArrayList<Home> homes) {
        Collections.sort(homes); // sorts the homes in the correct order by mls number from least to greatest works with the Home class compareTo function
        System.out.println();
        System.out.println("********************************* HOMES CURRENTLY FOR SALE *********************************");
        System.out.println();
        for (Home home : homes) {
            System.out.printf("Property #%s\t", home.getHomeNum());
            System.out.printf("Price: $%,.2f\t", home.getPrice());
            System.out.printf("Sq. Feet: %.2f\t", home.calculateSquareFeet());
            System.out.println("Beds: " + home.getNumberOfBedrooms() + " Baths: " + home.getNumberOfBathrooms());
            System.out.println("Address        " + home.getAddress() + ", " + home.getCity() + ", " + home.getState() + " " + home.getZipCode());
            System.out.println("Description    " + home.getDescription());
            System.out.println("Rooms");
            for (Room room : home.getRooms()) {
                System.out.printf("  %-15s %4.1f x %4.1f\n",room.getRoomName(), room.getLength(), room.getWidth());
            }
            System.out.println();
        }
    }
    
}

