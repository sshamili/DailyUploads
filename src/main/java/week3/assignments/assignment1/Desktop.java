package week3.assignments.assignment1;

/*
	Assignment 1:
	-------------
	Create an Interface as HardWare with method hardwareResources()
	
	Create another Interface  as Software with method softwareResources()
	
	Create a Class Desktop with method desktopModel() and implement both HardWare and Software interfaces and execute all the 3 methods

 */

public class Desktop implements Hardware, Software{

	public void desktopmodel() {
		System.out.println("Model: Dell Insprion");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopmodel();
		d.hardwareResource(); // Method of Hardware Interface
		d.softwareResource(); // Method of Software Interface
	}

	@Override
	public void hardwareResource() {
		System.out.println("Hardware: Intel Core i3 Processor");
	}

	@Override
	public void softwareResource() {
		System.out.println("Software: Windows 10");

	}

}
