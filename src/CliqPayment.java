
public class CliqPayment extends Payment {
	
	private String Alias;

	public CliqPayment(double amount ,String Alias) {
		super(amount);
		this.Alias=Alias;
	}

	@Override
	public void processpayament() {
		System.out.println("جاري التحويل لحساب كلك -يرجى الانتظار "+ getamount());
		 
		
	}
}
