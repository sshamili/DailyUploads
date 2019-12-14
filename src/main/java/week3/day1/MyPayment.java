package week3.day1;

public class MyPayment {

	public static void main(String[] args) {
		LearnInterface card = new CardPayment(1223, "11/26/2021", 333);
		card.payment(10000);

		LearnInterface net = new NetBankingPayment("Maharajan", "test");
		net.payment(10000);
		
		
		
		
		
		

	}

}
