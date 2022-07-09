package exception_handling;
//how you throw an unchecked exception
class Amount1{
	private String currency;
	private int amount;
	
	public Amount1(String currency,int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount1 that) throws Exception {
		if(!this.currency.equals(that.currency)) {
			throw new Exception("Currencies do not match");
		}
		this.amount += that.amount;
	}
	
	public String toString() {
		return currency + " " + amount;
	}
}

public class ThrowingExceptionError2 {

	public static void main(String[] args) throws Exception {
		Amount1 usd = new Amount1("USD",50);
		System.out.println(usd);
		Amount1 mmk = new Amount1("MMK",1000);
		
		usd.add(mmk);
	}
}
