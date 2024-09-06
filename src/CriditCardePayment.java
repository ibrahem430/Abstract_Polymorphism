
public class CriditCardePayment extends Payment {

	private String cardnumber;

	public CriditCardePayment(double amount ,String cardnumber) {
		
	super(amount);
	this.cardnumber=cardnumber;
	}
	@Override
	public void processpayament() {
		System.out.println(" يرجى الانتظار جاري تحضير الفاتورة -الدفع فيزا كارد:  "+ getamount());
		 
		
	}
	
}
