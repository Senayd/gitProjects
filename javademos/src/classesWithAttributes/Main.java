package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus laptop");
		product.setPrice(25000);
		product.setStockAmount(3);
		product.getId();
		product.setId(1);
		
		ProductManager productmaneger = new ProductManager();
		productmaneger.ProductManagerAdd();
		
		
		System.out.println(product.getKod());

	}

}
