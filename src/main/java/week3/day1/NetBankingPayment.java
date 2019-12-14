package week3.day1;

public class NetBankingPayment implements LearnInterface {
	private String userName;
	private String password;
	
	
	public NetBankingPayment(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}



	public void payment(int amount) {
		//num=20;
		System.out.println("payment thru netBanking user:"+userName+" for amount "+amount);
	}
}
