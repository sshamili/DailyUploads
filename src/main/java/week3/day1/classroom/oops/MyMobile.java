package week3.day1.classroom.oops;

public class MyMobile {

	public static void main(String[] args) {

		Redmi redmiphone = new Redmi();
		redmiphone.battery();
		redmiphone.softwareVersion();
		
		Samsung s = new Samsung();
		s.popupRotateableCamera();
		s.popupRotateableCamera("front camera");
		s.softwareVersion();
		
	}

}
