package terminal.model.ata286;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plane
{
    @Id
    @GeneratedValue
    private Long id;

    private String model;
    private int fuel;
    private LocalDateTime departureTime;
    private boolean serviceable;

    @ManyToMany(mappedBy = "planes", fetch = FetchType.EAGER)
    private List<Pilot> pilots = new ArrayList<>();

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getFuel()
    {
        return fuel;
    }

    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }

    public LocalDateTime getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime)
    {
        this.departureTime = departureTime;
    }

    public boolean isServiceable()
    {
        return serviceable;
    }

    public void setServiceable(boolean serviceable)
    {
        this.serviceable = serviceable;
    }

    public List<Pilot> getPilots()
    {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots)
    {
        this.pilots = pilots;
    }
}
