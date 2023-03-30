package terminal.model.airport;

import lombok.Data;
import terminal.dao.PlaneDao;
import terminal.model.enums.PlaneStatus;

import javax.persistence.*;

@Data
@Entity
public class Plane
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String route;
    private int fuelQuantity;
    @Enumerated(EnumType.STRING)
    private PlaneStatus status;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                route + " | " +
                fuelQuantity + " | " +
                status;
    }
}

