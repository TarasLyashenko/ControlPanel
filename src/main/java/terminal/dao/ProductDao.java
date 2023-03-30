package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Employee;
import terminal.model.Product;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Long>
{
    List<Product> findByFresh(Boolean fresh);
}
