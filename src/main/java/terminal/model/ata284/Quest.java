package terminal.model.ata284;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Quest
{
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private int price;

    @ManyToMany(mappedBy = "quests", fetch = FetchType.EAGER)
    private List<Actor> actors = new ArrayList<>();

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

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public List<Actor> getActors()
    {
        return actors;
    }

    public void setActors(List<Actor> actors)
    {
        this.actors = actors;
    }
}
