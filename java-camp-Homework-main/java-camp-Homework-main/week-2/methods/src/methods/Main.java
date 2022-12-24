package methods;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacakSayi;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("lütfen sayý girin : ");
		aranacakSayi=scanner.nextInt();
		
		//int aranacakSayi=2;
		
		boolean sayiVarmi = false;
		for(int sayi:sayilar) {
			if(sayi == aranacakSayi) {
				sayiVarmi = true;
				break;
			}	
		}
		String mesaj,mesaj2 = "";
		
		if(sayiVarmi) {
			mesaj = "istenlilen sayi listede vardýr : "+aranacakSayi;
			mesajVer(mesaj);
			
		}
		else {
			mesaj2="istenilen sayi listede yoktur!! : "+aranacakSayi;
			mesajVer(mesaj2);
			
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
	
	

	

}
