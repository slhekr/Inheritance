package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin= new IndividualCustomer(); //m��teri
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada= new CorporateCustomer(); //m��teri
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc= new SendikaCustomer(); //m��teri
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada); //tek tek �a�rmaktansa a�a��da toplu g�nderdik
		//customerManager.add(engin);
		//customerManager.add(abc);
		Customer[] customers= {engin,abc,hepsiBurada};
		customerManager.addMultiple(customers);
		

	}

}
