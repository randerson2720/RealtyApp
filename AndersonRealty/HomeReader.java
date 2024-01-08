import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class has a function that reads a text file of homes and puts them into arraylists
 * @author ryana
 * 
 */
 class HomeReader {
 public static ArrayList<Home> readHomesFromFile(String fileName) {
    String line;
    Home home = null;
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Home> homes = new ArrayList<>();
    
    // trys reading the file and then sets the parts of a home into corresponding array lists
    try {
         File file = new File(fileName);
        Scanner fscan = new Scanner(file);
        while(fscan.hasNextLine()){
            line = fscan.nextLine();
            if (line.startsWith("MLS")) {      
                if (home != null) {
                    home.setRooms(rooms);
                    homes.add(home);
                }
                home = new Home();
                rooms = new ArrayList<>();
                String homeParts[] = line.split("\t");
                home.setHomeNum(homeParts[0]);           
                home.setAddress(homeParts[1]);           
                home.setCity(homeParts[2]);              
                home.setState(homeParts[3]);
                home.setZipCode(Integer.parseInt(homeParts[4]));
                home.setNumberOfBedrooms(Integer.parseInt(homeParts[5]));
                home.setNumberOfBathrooms(Double.parseDouble(homeParts[6]));
                home.setPrice(Double.parseDouble(homeParts[7]));
                home.setDescription(homeParts[8]);
            }
            else {                                          // takes the lines of the file that hold the rooms and sets them into array lists
                line = line.substring(1, line.length());
                String roomParts[] = line.split("\t");
                rooms.add(new Room(roomParts[0],Double.parseDouble(roomParts[1]),Double.parseDouble(roomParts[2])));
            }
        }
        if (home != null) {
            home.setRooms(rooms);
            homes.add(home);
        }
          fscan.close();  
        } catch (FileNotFoundException ex){
            return null;
        }
        return homes;
    }
}