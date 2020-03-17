package lab4.ex1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Product {

	private int productId;

	private String name;

	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
