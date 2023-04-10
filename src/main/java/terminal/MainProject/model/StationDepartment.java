package terminal.MainProject.model;

import terminal.MainProject.enumStation.DepartmentTypes;

import javax.persistence.*;
import java.util.List;

@Entity
public class StationDepartment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private DepartmentTypes departmentTypes;
    private int NumberEmployees;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @OneToMany(mappedBy = "stationDepartment", fetch = FetchType.EAGER)
    private List<Worker> listWorker;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public DepartmentTypes getDepartmentTypes()
    {
        return departmentTypes;

    }

    public void setDepartmentTypes(DepartmentTypes departmentTypes)
    {
        this.departmentTypes = departmentTypes;
    }

    public int getNumberEmployees()
    {
        return NumberEmployees;
    }

    public void setNumberEmployees(int numberEmployees)
    {
        NumberEmployees = numberEmployees;
    }

    public Station getStation()
    {
        return station;
    }

    public void setStation(Station station)
    {
        this.station = station;
    }
}
