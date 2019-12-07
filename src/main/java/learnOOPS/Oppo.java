package learnOOPS;

public class Oppo extends Mobile{
public void popUpCamera() {
	System.out.println("Pop Up Camera");
}
// With in the same class, having different methods with same method signature
//and different type or number of arguments
public void camera() {
	System.out.println("Take a normal snap");
}

public void camera(String mode) {
	if(mode.equals("Potrait")) {
		System.out.println("Take a Potrait snap");
	}else {
		System.out.println("Take a Landscape snap");
	}
}

public void addNumbers(int a, int b) {
	
}
public int addNumbers(int a, int b, int c) {
	return a+b+c;
}
public void addNumbers(float a, float b) {
	
}










}
