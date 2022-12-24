package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList= {6.7,23.3,4.3,4.6}; // dizi tanýmladýktan sonra dizi içerisindeki elemanlarý bu þekildede doldurmamýz mümkündür.
		double total = 0;
		double enBuyuk = myList[0];
		
		for(double number: myList) {
			if(enBuyuk<number){// o anki sayý bizim en buyuk sayýmýzdan daha büyük ise
				enBuyuk = number;
				
			}
			total += number;
			System.out.println(number);
			
		}
		System.out.println("En büyük sayi : " + enBuyuk);
		System.out.println("dizi içerisindeki elemanlarýn toplamý : " +total);
		
		
		
		
		
	}

}
