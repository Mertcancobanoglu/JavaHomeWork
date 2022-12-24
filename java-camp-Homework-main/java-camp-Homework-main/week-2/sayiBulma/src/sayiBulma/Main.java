package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacakSayi=4;
		
		boolean sayiVarmi = false;
		for(int sayi:sayilar) {
			if(sayi == aranacakSayi) {
				sayiVarmi = true;
				break;
			}
			
			
		}
		if(sayiVarmi) {
			System.out.println("bu sayi listede vardýr ");
			
		}
		else {
			System.out.println("bu sayi listede mevcut deðildir ");
			
		}

		
		
		
		
	}

}
