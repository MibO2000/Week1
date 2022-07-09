package exception_handling;
//how you throw a checked exception
class Amount{
	private String currency;
	private int amount;
	
	public Amount(String currency,int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount that) {
		if(!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currencies do not match");
		}
		this.amount += that.amount;
	}
	
	public String toString() {
		return currency + " " + amount;
	}
}

public class ThrowingExceptionError {

	public static void main(String[] args) {
		Amount usd = new Amount("USD",50);
		System.out.println(usd);
		Amount mmk = new Amount("MMK",1000);
		usd.add(mmk);
	}
}
