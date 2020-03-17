package lab5.ex1;

import java.util.List;

public interface ProductDao {

	public Product getProduct(int id);

	public List<Product> getProducts();
	
	public void save(Product product);

}
