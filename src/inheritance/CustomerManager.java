package inheritance;

public class CustomerManager {
	
	public void add(Customer customer ) { // müþteri ekleme
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	//IndividualCustomer yazmak yerine customer yazdýk yinede çalýþtý ikiside
	//bunun sebebi polymorphism
	
	//public void add(CorporateCustomer customer) { //kurumsal müþteri ekleme
		//System.out.println(customer.customerNumber + " kaydedildi");
	//}
	
	public void addMultiple(Customer[] customers) { //sana bir tane müþteri erray yi yollýcam sen bunu ekle diyoruz
		for(Customer customer: customers) { //herbir customer için yukarýdaki add i çalýþtýr 
			add(customer);  //yukarýdaki add de gönderdiðimiz müþteriye göre add i çalýþtýrcak
		    
		
		}
		
		
		
	}

}
