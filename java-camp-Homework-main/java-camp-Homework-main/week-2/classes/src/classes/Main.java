package classes;

public class Main {

	public static void main(String[] args) {
		
		//reference type.
		CustomerMenager customerMenager;
		CustomerMenager customerMenager2 = new CustomerMenager();
		customerMenager=customerMenager2;
		customerMenager.add();
		customerMenager.remove();
		customerMenager.update();
		
		
		
		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		
		System.out.println(sayi2);
		
		
		//referance type (array).
		int[] sayilar = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		
		
		sayilar2=sayilar;
		
		sayilar[0]= 10;
		System.out.println(sayilar2[0]);
		

	}

}
