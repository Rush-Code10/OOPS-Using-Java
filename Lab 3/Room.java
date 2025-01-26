import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Room room1 = new Room(50);
		Room room2 = new Room(10,20);
		System.out.println("Area of Room1 is "+room1.Area());
		System.out.print("Area of Room2 is "+room2.Area());
    }
}

public class Room {	
	double length,breadth;
	public Room(double side) {
		this.length = side;
		this.breadth = side;
	}
	public Room(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double Area(){
		return length*breadth;
	}
}
