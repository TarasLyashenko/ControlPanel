package terminal.model;

public class Animal
{
    private String name;
    private Boolean live;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Boolean getLive()
    {
        return live;
    }

    public void setLive(Boolean live)
    {
        this.live = live;
    }

    @Override
    public String toString()
    {
        return  name + " | " +
                 live;
    }
}
