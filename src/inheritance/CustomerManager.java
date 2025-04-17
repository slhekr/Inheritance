package inheritance;

public class CustomerManager {
	
	public void add(Customer customer ) { // m��teri ekleme
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	//IndividualCustomer yazmak yerine customer yazd�k yinede �al��t� ikiside
	//bunun sebebi polymorphism
	
	//public void add(CorporateCustomer customer) { //kurumsal m��teri ekleme
		//System.out.println(customer.customerNumber + " kaydedildi");
	//}
	
	public void addMultiple(Customer[] customers) { //sana bir tane m��teri erray yi yoll�cam sen bunu ekle diyoruz
		for(Customer customer: customers) { //herbir customer i�in yukar�daki add i �al��t�r 
			add(customer);  //yukar�daki add de g�nderdi�imiz m��teriye g�re add i �al��t�rcak
		    
		
		}
		
		
		
	}

}
