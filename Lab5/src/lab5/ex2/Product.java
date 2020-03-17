package lab5.ex2;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Product {

	private int productId;
	
	private String name;
	
	private int price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
