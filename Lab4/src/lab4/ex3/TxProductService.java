package lab4.ex3;


public class TxProductService {

	private ProductDao productDao;
	
	public void testTx() {
		Product p = productDao.getProduct(1);
		p.setName("myname");
		productDao.update(p);
		raiseException();
	}

	private static void raiseException() {
		throw new RuntimeException();
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
