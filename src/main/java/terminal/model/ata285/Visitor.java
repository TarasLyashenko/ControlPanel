package terminal.model.ata285;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Visitor
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "visitor_restaurant",
            joinColumns = @JoinColumn(name = "visitor_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private List<Restaurant> restaurants = new ArrayList<>();

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

    public List<Restaurant> getRestaurants()
    {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants)
    {
        this.restaurants = restaurants;
    }
}
