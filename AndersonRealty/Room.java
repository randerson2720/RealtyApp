/** the Room class sets the rooms in the program
 * @author ryana
 */
class Room {
    private String roomName;
    private double length;
    private double width;
    public Room(String name, double length, double width) {
        this.roomName = name;
        this.length = length;
        this.width = width;
    }
                                    // getters and setters for the room class
    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public double getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double getArea() {          // gets the area of the room to use in the calculated square feet of the property
        return length * width;
    }
    // returns the correct format for room
    public String toString() {
        return "Room{" + "roomName='" + roomName + '\'' + ", length=" + length + ", width=" + width + '}';
    }

    
}
