package terminal.MainProject.model;

import terminal.MainProject.enumStation.TypeRescuePod;

import javax.persistence.*;

@Entity
public class RescuePod
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station connectedStation;

    private String title;
    private int quantityFuel;
    private TypeRescuePod typeRescuePod;

    public Station getConnectedStation()
    {
        return connectedStation;
    }

    public void setConnectedStation(Station connectedStation)
    {
        this.connectedStation = connectedStation;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getQuantityFuel()
    {
        return quantityFuel;
    }

    public void setQuantityFuel(int quantityFuel)
    {
        this.quantityFuel = quantityFuel;
    }

    public TypeRescuePod getTypeRescuePod()
    {
        return typeRescuePod;
    }

    public void setTypeRescuePod(TypeRescuePod typeRescuePod)
    {
        this.typeRescuePod = typeRescuePod;
    }
}
