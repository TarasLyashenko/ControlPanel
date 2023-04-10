package terminal.model.ata285;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurant
{
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private int yearOfConstruction;
    private boolean works;

    @ManyToMany(mappedBy = "restaurants", fetch = FetchType.EAGER)
    private List<Visitor> visitors = new ArrayList<>();

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
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

    public int getYearOfConstruction()
    {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction)
    {
        this.yearOfConstruction = yearOfConstruction;
    }

    public boolean isWorks()
    {
        return works;
    }

    public void setWorks(boolean works)
    {
        this.works = works;
    }

    public List<Visitor> getVisitors()
    {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors)
    {
        this.visitors = visitors;
    }
}
