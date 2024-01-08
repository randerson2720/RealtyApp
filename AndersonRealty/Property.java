public abstract class Property implements Comparable {
    /** property is the superclass, has everything that defines the property like mlsnumber nad squarefeet
     * @author ryana
     */
    protected String homeNum;
    protected double squareFeet;

    public Property(){}
    public Property(String homeNum, double squareFeet) {
        this.homeNum = homeNum;
        this.squareFeet = squareFeet;
    }
    public String getHomeNum() {
        return homeNum;
    }
    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }
    public double getSquareFeet() {
        return squareFeet;
    }
    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    @Override
    public String toString() {
        return "Property{" + "homeNum='" + homeNum + '\'' + ", squareFeet=" + squareFeet + '}';
    }
    
}


