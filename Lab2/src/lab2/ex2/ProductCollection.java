package lab2.ex2;

import java.util.List;
import java.util.Map;

public class ProductCollection {

	private List<Product> list;

	private Map<String, Product> map;

	public Map<String, Product> getMap() {
		return map;
	}

	public void setMap(Map<String, Product> map) {
		this.map = map;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

}
