package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "bugün hava cok güzel..";
		String yeniMesaj=mesaj.substring(0,2);
		String yeniMesaj2=sehirVer().substring(0,3);
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj2);
		System.out.println(toplama(12, 13));
		
		int toplam=topla2(1,2);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("eklendi..");
		
	}
	public static void sil() {
		System.out.println("silindi..");
		
	}
	public static void guncelle() {
		System.out.println("güncellendi..");
		
	}
	public static int toplama(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "Ýstanbul";
	}
	
	public static int topla2(int...sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam=toplam+sayi;
			
		}
		return toplam;
	}
	
	
}
