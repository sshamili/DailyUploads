package week3.day1.learnOOPS;

public class MyMobile {
	public static void main(String[] args) {
		Oppo oppo = new Oppo();
		OnePlus op = new OnePlus();
		oppo.makePhoneCall();
		oppo.sendSMS();
		oppo.popUpCamera();
		oppo.camera();
		oppo.camera("Potrait");
		
		op.fingurePrintSensor();
		op.sendSMS();
		op.makePhoneCall();
	}

}
