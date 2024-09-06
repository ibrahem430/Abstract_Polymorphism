
abstract public class Payment {
private double amount;
public Payment(double amount) {
	this.amount=amount;
}

public double getamount() {
	return amount;
}
public abstract void processpayament() ;

public void GenerateReceipt() {
	System.out.println("recept generated for amount of : "+amount);
}

}
