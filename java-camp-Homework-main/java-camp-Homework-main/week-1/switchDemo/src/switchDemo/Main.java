package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel! "+ grade + " ile geçtiniz..");
			break;
		case 'B':
			//System.out.println("Çok güzel! "+ grade + " ile geçtiniz..");
			//break;
		case 'C':
			System.out.println("Ýyi! "+ grade + " ile geçtiniz..");
			break;
		case 'D':
			System.out.println("Fena deðil! "+ grade + " ile geçtiniz..");
			break;
		case 'F':
			System.out.println("Malesef! "+ grade + " ile kaldýnýz..");
			break;
			default:
				System.out.println("hatalý bir notlama girdiniz!! ");
		}

	}

}
