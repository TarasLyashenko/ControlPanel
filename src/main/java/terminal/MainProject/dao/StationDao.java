package terminal.MainProject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.MainProject.enumStation.TypeStation;
import terminal.MainProject.model.Station;

@Repository
public interface StationDao extends CrudRepository<Station, Long>
{
    Station findByTypeStation(TypeStation typeStation);
}
