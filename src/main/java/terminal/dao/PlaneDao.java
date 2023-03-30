package terminal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Product;
import terminal.model.airport.Plane;

import java.util.List;

@Repository
public interface PlaneDao extends CrudRepository<Plane, Long>
{
    @Query("SELECT p FROM Plane p WHERE p.inTheParking = 'IN_THE_HANGAR'")
    List<Plane> findAircraftInTheHangar();

    @Query("SELECT p FROM Plane p WHERE p.inTheParking = 'IN_THE_AIR'")
    List<Plane> findAircraftInTheAir();
}
