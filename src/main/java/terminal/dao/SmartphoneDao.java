package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata272.Smartphone;

@Repository
public interface SmartphoneDao extends CrudRepository<Smartphone, Long>
{

}
