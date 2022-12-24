package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","asus laptop",5.000,2,"siyah","");
		
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("asus laptop");
//		product.setPrice(5.000);
//		product.setStockAmount (3);
		
		
		
		
		ProductMenager productMenager = new ProductMenager();
		productMenager.Add(product);
		
		
		System.out.println(product.getKod());
	}

}
