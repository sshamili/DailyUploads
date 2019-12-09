package week3.assignments.assignment2;

/*  Assignment 2:
	------------
	Create abstract Class called Bike with cost() as implemented method, speed() as unimplemented method
	
	Create class Bajaj extends Bike abstract class and execute both cost() and speed()
*/

public class Bajaj extends Bike{
	
	@Override
	public void speed() {
		System.out.println("Bike Speed: 200Km/hr");
		
	}

	public static void main(String[] args) {
		Bajaj b = new Bajaj();
		b.cost();
		b.speed();
	}

}
