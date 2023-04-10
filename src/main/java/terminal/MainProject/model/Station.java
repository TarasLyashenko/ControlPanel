package terminal.MainProject.model;

import terminal.MainProject.enumStation.TypeStation;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Station
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private TypeStation typeStation;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private Set<StationDepartment> stationDepartments;

    @OneToMany(mappedBy = "connectedStation", fetch = FetchType.EAGER)
    private Set<RescuePod> rescuePods;


    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public TypeStation getTypeStation()
    {
        return typeStation;
    }

    public void setTypeStation(TypeStation typeStation)
    {
        this.typeStation = typeStation;
    }

    public Set<StationDepartment> getStationDepartments()
    {
        return stationDepartments;
    }

    public void setStationDepartments(Set<StationDepartment> stationDepartments)
    {
        this.stationDepartments = stationDepartments;
    }

    public Set<RescuePod> getRescuePods()
    {
        return rescuePods;
    }

    public void setRescuePods(Set<RescuePod> rescuePods)
    {
        this.rescuePods = rescuePods;
    }
}
