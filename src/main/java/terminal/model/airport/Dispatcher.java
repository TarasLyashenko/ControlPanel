package terminal.model.airport;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Dispatcher
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private boolean arrived;
    private int numberOfAirplane;

    @Override
    public String toString()
    {
        return  id + " | " +
                title + " | " +
                arrived + " | " +
                numberOfAirplane;
    }
}
