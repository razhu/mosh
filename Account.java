
public class Account {
	//access modifiers private public..ec 
	private float balance;

	public float getBalance() {
		return balance;
	}

	public float setBalance(float balance) {
		if(balance > 0) {
			this.balance = balance;	
		}
		return this.balance;
	}
	public float deposit(float amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}
	public float withdraw(float amount) {
		if (amount > 0) {
			balance -= amount;
		}
		return balance;
	}	
}
