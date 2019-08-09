package Assignment3_1;

public class Main {

	public static void main(String[] args){
		Car c1 = new Car("Tundra", "Camaro");
		
		Car c2 = new Car("Black", "Silver");
		
		System.out.println("Car, c1, has instance variables: " + c1.name + " and " + c1.color + ".");
		System.out.println("Car, c2, has instance variables: " + c2.name + " and " + c2.color + ".");
		
		System.out.println("Both cars have the same class variables: HasEngine = " + Car.hasEngine + " and Zooms = " + Car.tires + " because all Cars have them.");

	}
}
