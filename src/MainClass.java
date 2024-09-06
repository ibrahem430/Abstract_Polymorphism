
public class MainClass {

	public static void main(String[] args) {
Payment oPayment1=new CriditCardePayment(100," 1221 1222 4334 5546");
Payment oPayment2= new CliqPayment(100, "user75");
 Payment oPayment3=new CashPayment(99);
	Process_Payment_To_Generate_A_New_Receipt(oPayment2);
	Process_Payment_To_Generate_A_New_Receipt(oPayment1);
	Process_Payment_To_Generate_A_New_Receipt(oPayment3);
	}
	public static void Process_Payment_To_Generate_A_New_Receipt(Payment payment) {
		payment.processpayament();
		payment.GenerateReceipt();
	}

}
