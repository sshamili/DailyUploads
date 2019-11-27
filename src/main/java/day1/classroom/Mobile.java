package day1.classroom;

public class Mobile {

	public int makeCall(int number) {
		return number;
	}
	
	public  String sendSMS(String SMS) {
		return SMS;
	}
	
	public boolean shutDown() {
		return true;
	}
	
	public static void main(String[] args) {
		
		Mobile actions = new Mobile();
		int makeCall = actions.makeCall(803842034);
		System.out.println("Dialing to "+makeCall);
		
		String sendSMS = actions.sendSMS("hi");
		System.out.println("Sent message content is "+sendSMS);
		
		boolean shutDown = actions.shutDown();
		System.out.println("Mobile switched off");
		
	}
}
