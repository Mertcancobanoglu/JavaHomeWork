package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "onur";
		String ogrenci2= "mert";
		String ogrenci3= "banu";
		String ogrenci4= "ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("----------------------");
		String[] ogrenciler = new String[3]; // dizi tanýmlamasý yaparak burada öðrenciler dizisi içerisinde 3 adet veri olacaðýný belirttik.
		
		
		ogrenciler[0]= "onur";
		ogrenciler[1]= "mert";
		ogrenciler[2]= "banu";

		
		for (String ogrenci : ogrenciler) { // for each döngüsü ile dizilerin içerisinde döngü kurarak öðrencileri yazdýrdýk
			System.out.println(ogrenci);
		}
		System.out.println("1. for döngüsü bitti ");
		System.out.println("*********************************************************");
		
		
		
		for (int i = 0 ; i<ogrenciler.length ; i++) { // diðer bir for döngüsü ile yapýlan dizilerin içerisinde döngü kurma durumu ve bu durumla birlikte öðrencileri yazdýrmýþ olduk.
			
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("2. for döngüsü bitti");
	}

}
