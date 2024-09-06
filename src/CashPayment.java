
public class CashPayment extends Payment {
public CashPayment(double amount) {
		super(amount);
	}

public void processpayament() {
	System.out.println(" يرجى الانتظار جاري تحضير الفاتورة -الدفع كاش:  "+ getamount());
}
}
