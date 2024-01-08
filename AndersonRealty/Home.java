import java.util.ArrayList;
/** the Home class extends the Property class
 *  @author ryana
 * contains all getters and setters
 */ 
public class Home extends Property {
    private ArrayList<Room> rooms;
    private int numberOfBedrooms;
    private double numberOfBathrooms;
    private int zipCode;
    private String city;
    private String state;
    private String address;
    private String description;
    private double price;
    
    public Home() {
    }
    public Home(ArrayList<Room> rooms, int numberOfBedrooms, double numberOfBathrooms, int zipCode, String city, String state, String description, double price, String address) {
        this.rooms = rooms;
        this.numberOfBedrooms = numberOfBedrooms; 
        this.numberOfBathrooms = numberOfBathrooms;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.description = description;
        this.price = price;
        this.address = address;

    }
    public Home(String homeNum, double squareFeet, ArrayList<Room> rooms, int numberOfBedrooms, double numberOfBathrooms, int zipCode, String city, String state,
                String description, double price, String address) {
        super(homeNum, squareFeet);
        this.rooms = rooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.description = description;
        this.price = price;
        this.address = address;
    }
    // all getters and setters for the home class
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
    public int getZipCode() {
        return zipCode;
    } 
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address; 
    }
    // calculates the square feet for the entire home by taking in the rooms arraylist and adding up their areas
    public double calculateSquareFeet() {
        double squareFeet = 0;
        for (int i = 0; i<rooms.size(); i++) {
            squareFeet += (rooms.get(i).getLength() * rooms.get(i).getWidth());
        }
        return squareFeet;
    }
    @Override
    public String toString() {
        return "Home{" + "homeNum='" + homeNum + '\'' + ", squareFeet=" + squareFeet + ", rooms=" + rooms + ", numberOfBedrooms=" + numberOfBedrooms + ", numberOfBathrooms=" + numberOfBathrooms
        + ", zipCode=" + zipCode + ", city='" + city + '\'' + ", state='" + state + '\'' + ", description='" + description + '\'' + ", address='" + address + '\'' + ", price=" + price + 
        '}';
    }
    @Override
    // compare function to see which mls number gets printed first
    public int compareTo(Object o) {
        Home other = (Home) o;
        Integer leastNum = Integer.parseInt(homeNum.substring(this.homeNum.indexOf('-') + 1, this.homeNum.length()));
        Integer greaterNum = Integer.parseInt(other.getHomeNum().substring(other.getHomeNum().indexOf('-') + 1, other.getHomeNum().length()));
        return leastNum.compareTo(greaterNum);
    } 
}
