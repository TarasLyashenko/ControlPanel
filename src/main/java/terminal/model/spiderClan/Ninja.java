package terminal.model.spiderClan;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Ninja
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int energy;
    private boolean live;
    private LocalDateTime localDateTime;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                energy + " | " +
                live + " | " +
                localDateTime;
    }
}
