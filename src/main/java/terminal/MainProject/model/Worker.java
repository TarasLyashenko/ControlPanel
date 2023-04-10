package terminal.MainProject.model;

import javax.persistence.*;

@Entity
public class Worker
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "station_department_id")
    private StationDepartment stationDepartment;

    private String name;
    private int age;
    private double workExperience;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public StationDepartment getStationDepartment()
    {
        return stationDepartment;
    }

    public void setStationDepartment(StationDepartment stationDepartment)
    {
        this.stationDepartment = stationDepartment;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getWorkExperience()
    {
        return workExperience;
    }

    public void setWorkExperience(double workExperience)
    {
        this.workExperience = workExperience;
    }
}
