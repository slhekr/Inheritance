package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin= new IndividualCustomer(); //müþteri
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada= new CorporateCustomer(); //müþteri
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc= new SendikaCustomer(); //müþteri
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada); //tek tek çaðrmaktansa aþaðýda toplu gönderdik
		//customerManager.add(engin);
		//customerManager.add(abc);
		Customer[] customers= {engin,abc,hepsiBurada};
		customerManager.addMultiple(customers);
		

	}

}
