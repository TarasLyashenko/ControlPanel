package terminal.MainProject.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.MainProject.model.RescuePod;

import javax.annotation.Resource;

@Resource
public interface RescuePodDao extends CrudRepository<RescuePod, Long>
{
    RescuePod findByTitle(String title);
}
