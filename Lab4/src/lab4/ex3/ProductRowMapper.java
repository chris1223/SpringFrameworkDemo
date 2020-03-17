package lab4.ex3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowCount) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt("id"));
		product.setDescription(rs.getString("desc"));
		product.setName(rs.getString("name"));
		return product;
	}

}
