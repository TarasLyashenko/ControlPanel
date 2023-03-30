package terminal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Product;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Long>
{
    @Query("SELECT p FROM Product p WHERE p.status != 'TRASH'")
    List<Product> findProductsReadyToCook();

    @Query("SELECT p FROM Product p WHERE p.status = 'TRASH'")
    List<Product> findProductsForRelease();

}
