package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi = 28;
		int total = 0;
		
		
		for(int i=1; i<sayi ; i++) {
			if(sayi % i == 0) {
				total=total + i;
				
			}
		}
		if(sayi == total) {
			System.out.println(sayi + " sayýsý bir mükemmel sayýdýr.");
		}else {
			System.out.println(sayi + " sayýsý bir mükemmel sayý deðildir!");
		}
		
	}

}
