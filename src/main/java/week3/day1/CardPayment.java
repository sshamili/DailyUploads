package week3.day1;

public class CardPayment implements LearnInterface {
		private int cardNum;
		private String expDate;
		private int cvv;
		
			
		public CardPayment(int cardNum, String expDate, 
				int cvv) {
			this.cardNum=cardNum;
			this.expDate=expDate;
			this.cvv=cvv;
			
			
		}
		
		
		
		
		
		
	public void payment(int amount) {
		//num=20;
		System.out.println("payment thru card num:"+cardNum+" for amount "+amount);
	}
	
	
}
