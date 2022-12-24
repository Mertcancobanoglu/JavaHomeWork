package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf = 'A';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf + " kalýn sesli bir harftir.");
			break;
			
		default:
			System.out.println(harf + " ince sesli bir harftir");
		
			
		}
	}

}
