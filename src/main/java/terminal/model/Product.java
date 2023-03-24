package terminal.model;

public class Product
{
    private String name;
    private boolean fresh;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isFresh()
    {
        return fresh;
    }

    public void setFresh(boolean fresh)
    {
        this.fresh = fresh;
    }

    @Override
    public String toString()
    {
        return name + " | " +
                fresh;
    }
}
