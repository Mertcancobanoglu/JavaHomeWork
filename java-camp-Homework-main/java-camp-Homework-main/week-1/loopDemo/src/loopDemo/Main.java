package loopDemo;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

	public static void main(String[] args) {
		//for döngüsü:
		
		for(int i = 0 ; i<10; i++) {
			System.out.println(i); // sýfýrdan baþlayarak 10 a kadar olan sayýlarý döngü ile yazdýrdýk. 10 dahil deðildir!!
			
		}
		System.out.println("1. for döngüsü bitti!!");
		
		System.out.println("----------------------------");
		
		
		for(int a = 0 ; a<100;a+=2 ) {
			System.out.println(a);// sýfýrdan baslayarak 100 e kadar 2 þer 2 þer artarak giden bir for döngüsü yazdýk 100 dahil deðildi.!!
		}
		System.out.println("2. for döngüsü bitti ");
		
		System.out.println("FOR DÖNGÜLERÝ BÝTTÝ !!!!");
		//while döngüsü:
		
		int sayac = 0;
		
		while (sayac<10){ // sýfýrdan baslayarak 10 a kadar olan sayýlarý döngü ile yazdýrdýk. 
			sayac = sayac + 1 ;
			System.out.println(sayac);
			
		
		}
		System.out.println("1. while döngüsü bitti!!");
		
		
		System.out.println("--------------------------------------");
		
		while(sayac<100) { // sýfýrdan baslayarak 100 e kadar 2 þer 2 þer arttýrarak giden bir while döngüsü yazdýk  
			sayac = sayac + 2;
			System.out.println(sayac);
		}
		
		System.out.println("2. While döngüsü bittiiiiii ");
		
		System.out.println("WHÝLE DÖNGÜLERÝ BÝTTÝ !!!  ");
		
		//do-while döngüsü: 
		
		int j=0;
		do { // sýfýrdan baslayarak 10 a kadar olan sayýlarý döngü ile yazdýrdýk. 10 dahil deðildir.
			
			System.out.println(j);
			j+=1;
		}while(j<10);
		
		System.out.println("1.do while döngüsü bitti");
		
		System.out.println("------------------------------------");
		
		do { // sýfýrdan baslayarak 100 e kadar 2 þer 2 þer arttýrarak giden bir while döngüsü yazdýk 100 dahil deðildir. 
			System.out.println(j);
			j +=2;
			
		}while(j<100);
		
		System.out.println("2. do while döngüsü bitti ");
		
		System.out.println("DO-WHÝLE DÖNGÜLERÝ BÝTTÝ !!! ");
	}

}
