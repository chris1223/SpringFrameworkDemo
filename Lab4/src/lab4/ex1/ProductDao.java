package lab4.ex1;

import java.util.List;

public interface ProductDao {

	public Product getProduct(int id);

	public List<Product> getProducts();

	public int insert(Product product);
	
	public void update(Product product);
}
