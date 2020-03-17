package lab2.ex2;

public class ProductFactory {
	public Product getInstance() {
		Product p = new Product();
		p.setName("zebra");
		p.setProductId("10003");
		p.setDescription("my zebra");
		return p;
	}
}
