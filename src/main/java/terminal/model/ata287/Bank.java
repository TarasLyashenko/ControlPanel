package terminal.model.ata287;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank
{
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private int yearOfFoundation;
    private int numberOfEmployees;
    private boolean works;

    @ManyToMany(mappedBy = "banks", fetch = FetchType.EAGER)
    private List<Client> clients = new ArrayList<>();

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

    public int getYearOfFoundation()
    {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation)
    {
        this.yearOfFoundation = yearOfFoundation;
    }

    public int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees)
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    public boolean isWorks()
    {
        return works;
    }

    public void setWorks(boolean works)
    {
        this.works = works;
    }

    public List<Client> getClients()
    {
        return clients;
    }

    public void setClients(List<Client> clients)
    {
        this.clients = clients;
    }
}
