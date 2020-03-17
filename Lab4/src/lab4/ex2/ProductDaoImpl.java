package lab4.ex2;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class ProductDaoImpl extends NamedParameterJdbcDaoSupport implements
		ProductDao {

	private ProductRowMapper productRowMapper;

	public Product getProduct(int productId) {

		SqlParameterSource namedParameters = new MapSqlParameterSource(
				"productId", productId);

		return (Product) getNamedParameterJdbcTemplate().queryForObject(
				"select * from product where id = :productId", namedParameters,
				productRowMapper);

	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {

		return (List<Product>) getJdbcTemplate().query("select * from product",
				productRowMapper);

	}

	public void setProductRowMapper(ProductRowMapper productRowMapper) {
		this.productRowMapper = productRowMapper;
	}

	public int insert(Product product) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource params = new MapSqlParameterSource("name", product
				.getName()).addValue("desc", product.getDescription());
		getNamedParameterJdbcTemplate().update(
				"insert into product (`name`,`desc`) values (:name,:desc)",
				params,keyHolder);
		return keyHolder.getKey().intValue();
	}

	public void update(Product product) {
		
		SqlParameterSource params = new MapSqlParameterSource("id", product
				.getProductId()).addValue("name", product.getName()).addValue(
				"desc", product.getDescription());
		getNamedParameterJdbcTemplate().update(
				"update product set product.name=:name, product.desc=:desc where id=:id",
				params);
	}
	
	


}
