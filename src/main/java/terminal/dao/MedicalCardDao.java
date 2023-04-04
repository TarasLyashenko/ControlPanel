package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata275.MedicalCard;

public interface MedicalCardDao extends CrudRepository<MedicalCard, Long>
{

}
