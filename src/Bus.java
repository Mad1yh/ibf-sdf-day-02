public class Bus extends Vehicle {

private Boolean frontdoor;
private Boolean backDoor;
private Boolean frontDoorOpened;
private Boolean backDoorOpened;
public Bus(String color, int capacity, String licensePlateNo, String year, String model, String make, Boolean frontdoor,
        Boolean backDoor) {
    super(color, capacity, licensePlateNo, year, model, make);
    this.frontdoor = frontdoor;
    this.backDoor = backDoor;
}
public Boolean getFrontdoor() {
    return frontdoor;
}
public void setFrontdoor(Boolean frontdoor) {
    this.frontdoor = frontdoor;
}
public Boolean getBackDoor() {
    return backDoor;
}
public void setBackDoor(Boolean backDoor) {
    this.backDoor = backDoor;
}



}
