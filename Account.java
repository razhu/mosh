
public class Account {
	//access modifiers private public..ec 
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		if(balance > 0) {
			this.balance = balance;	
		}
	}
	public void deposit (float amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	public void withdraw (float amount) {
		if (amount > 0) {
			balance -= amount;
		}
	}	
}
