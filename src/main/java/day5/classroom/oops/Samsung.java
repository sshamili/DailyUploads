package day5.classroom.oops;

public class Samsung extends Mobile{

	public String popupRotateableCamera() {
		
	return "popup selfi";
	}


	public String popupRotateableCamera(String mode) {
		if(mode.equals("front camera")) {
			
			return "popup selfi";
		}else {
			return "Normal back Camera";
		}
	}


}
