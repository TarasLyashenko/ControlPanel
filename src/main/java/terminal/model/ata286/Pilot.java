package terminal.model.ata286;

import terminal.model.ata285.Restaurant;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pilot
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private double workExperience;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "pilot_plane",
            joinColumns = @JoinColumn(name = "pilot_id"),
            inverseJoinColumns = @JoinColumn(name = "plane_id"))
    private List<Plane> planes = new ArrayList<>();

    public List<Plane> getPlanes()
    {
        return planes;
    }

    public void setPlanes(List<Plane> planes)
    {
        this.planes = planes;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
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
