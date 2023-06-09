package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata286.Plane;

@Repository
public interface PlaneDao extends CrudRepository<Plane, Long>
{
    Plane findByModel(String model);
}

