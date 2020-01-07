
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando las cosas");
		User us = new User("lauramuis");
		// us.name = "ramiro";
		// System.out.println(us.name);
		// us.sayName();
		System.out.println("Abajo tax calculator....");
		TaxCalculator2019 tx = new TaxCalculator2019();
		TaxCalculator2020 tx2 = new TaxCalculator2020();
		System.out.println("my taxes for 2019... " + tx.calculateTax());
		System.out.println("my taxes for 2020... " + tx2.calculateTax());
		// encapsulation
		Account acc = new Account();
		acc.balance = 10;
		System.out.println("Acc " +  acc.balance);
	}

}
