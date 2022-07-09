package exception_handling;
//how you throw an unchecked exception

class CurrenciesDoNotMatchException extends Exception{
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

class Amount2{
	private String currency;
	private int amount;
	
	public Amount2(String currency,int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount2 that) throws CurrenciesDoNotMatchException {
		if(!this.currency.equals(that.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies do not match");
		}
		this.amount += that.amount;
	}
	
	public String toString() {
		return currency + " " + amount;
	}
}

public class ThrowingExceptionError3 {

	public static void main(String[] args) throws Exception {
		Amount2 usd = new Amount2("USD",50);
		System.out.println(usd);
		Amount2 mmk = new Amount2("MMK",1000);
		
		usd.add(mmk);
	}
}
