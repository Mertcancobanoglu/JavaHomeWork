package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bugun Hava Çok Sýcak                     " ;
		
		
		System.out.println(mesaj);

//		System.out.println("eleman sayýsý : "+ mesaj.length());
//		System.out.println("5. elemaný : "+ mesaj.charAt(4));
//		System.out.println(mesaj.concat(" of!"));//sonuna yaþasýn kelimesini ekledik.
//		System.out.println(mesaj.startsWith("B"));// eðer mesaj içerisindeki yazýlan ifade B ile baþlýyorsa true döner yoksa false döner.
//		System.out.println(mesaj.endsWith("k")); // mesaj içerisindeki yazýlan ifade k ile bitiyor ise true döner yoksa false döner.
//		
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		
//		System.out.println(mesaj.indexOf("a"));//ilk buldugu a harfinde aramayý bitirir ve oradaki indexi gösterir.
//		System.out.println(mesaj.lastIndexOf("a")); // saðdan baþlayarak a harfini arar ve oradaki indexi gösterir.
		
		String yeniMesaj = mesaj.replace(' ', '-');// boþuk olan yerleri - ile deðiþtirme iþlemi
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));// 2. indexinden itibaren yaz.
		
		System.out.println(mesaj.substring(2,8)); // 2. indexten 8 'e kadar olan indexin yerlerini yaz.
		
		for(String kelime :mesaj.split(" ")) {// split kullanarak her bir kelimeyi dizi olarak tek tek yazma iþlemi
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//cümlede geçen bütün büyük harfleri küçültmeye yarar.
		
		System.out.println(mesaj.toUpperCase());//cümlede geçen büyük küçük harfleri büyütmeye yarar.
		
		
		System.out.println(mesaj.trim());// baþýndaki ve sonundaki boþluklarý atmaya yarar.
		
		
		
		
		
	}

}
