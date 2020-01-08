
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
		// encapsulation: hide members and functions (public/private access modifiers)
		Account acc = new Account();
		System.out.println("Current balance:  " +  acc.getBalance());
		System.out.println("Deposit money 10$: " + acc.deposit(10));
		System.out.println("Current balance:  " +  acc.getBalance());
		System.out.println("withdraw money 5$: " + acc.withdraw(5));
		// abstraction: hide unnecessary stuff, reduce complexity
		MailService ms = new MailService();
		ms.sendEmail();
		// inheritance. reusing code (accross classes)
		System.out.println("Inherantece below....");
		TextBox tb = new TextBox();
		tb.enable("text box enabled");
		Button b = new Button();
		b.enable("Button enabled");
		// polimorfism: many forms. 
		System.out.println("what follows is a polimorfism stuff");
		TextBox tb1 = new TextBox();
		tb1.draw();
			
		Button b1 = new Button();
		b1.draw();		
		System.out.println("visto desde otro angulo...");
		drawIOControl(new TextBox());
		drawIOControl(new Button());
	}
	
	public static void drawIOControl(IOControl ioc) {
		ioc.draw();
	}
}
