package terminal.rowmappers;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import terminal.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductRowMapper implements RowMapper<Product>
{
    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException
    {
        Product product = new Product();
        String name = resultSet.getString("name");
        Boolean fresh = resultSet.getBoolean("fresh");

        product.setName(name);
        product.setFresh(fresh);

        return product;

    }
}
