package lab5.ex2;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProductDaoHibernateImpl extends HibernateDaoSupport implements
		ProductDao {

    public Product getProduct(int id)
    {
        return null;
    }

    public List<Product> getProducts()
    {
        return null;
    }

    public void save(Product product)
    {
        
    }

	

}