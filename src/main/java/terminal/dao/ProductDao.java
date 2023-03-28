package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Long>
{

}
