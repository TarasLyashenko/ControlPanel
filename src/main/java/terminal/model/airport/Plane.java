package terminal.model.airport;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private boolean inTheParking;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                route + " | " +
                fuelQuantity + " | " +
                inTheParking;
    }
}

