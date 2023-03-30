package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Product;
import terminal.model.airport.Plane;

import java.util.List;

@Repository
public interface PlaneDao extends CrudRepository<Plane, Long>
{
    List<Plane> findByInTheParking (Boolean parking);
}
