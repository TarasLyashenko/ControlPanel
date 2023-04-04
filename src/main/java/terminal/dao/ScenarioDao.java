package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata278.Scenario;

import javax.annotation.Resource;

@Resource
public interface ScenarioDao extends CrudRepository<Scenario, Long>
{

}
