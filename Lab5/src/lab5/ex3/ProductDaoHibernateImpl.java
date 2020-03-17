package lab5.ex3;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProductDaoHibernateImpl extends HibernateDaoSupport implements
		ProductDao {

	@SuppressWarnings("unchecked")
	public List<Product> getProducts() throws DataAccessException {
		return (List<Product>) getHibernateTemplate().find("from Product p");
	}

	public Product getProduct(final int id) {
		return (Product) getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException {
						return session.createCriteria(Product.class).add(
								Expression.eq("id", id)).uniqueResult();
					}
				});
	}

	public void save(Product product) {
		getHibernateTemplate().saveOrUpdate(product);
	}

}