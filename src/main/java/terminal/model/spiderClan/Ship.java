package terminal.model.spiderClan;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Ship
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int energy;
    private boolean destroy;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                energy + " | " +
                destroy;
    }
}
