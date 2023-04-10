package terminal.model.ata284;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Actor
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private double workExperience;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "actor_quest",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "quest_id"))
    private List<Quest> quests = new ArrayList<>();

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

    public List<Quest> getQuests()
    {
        return quests;
    }

    public void setQuests(List<Quest> quests)
    {
        this.quests = quests;
    }
}
