
public abstract class Airplane extends Vehicle implements Flyer
{
    private String takeOff;
    private String land;
    private String fly;
    
    public Airplane(String TakeOff, String Land, String Fly)
    {
        takeOff = TakeOff;
        land = Land;
        fly = Fly;
    }
    
    public void setTakeOff(String TakeOff)
    {
        takeOff = TakeOff;
    }
    
    public String getTakeOff()
    {
        return takeOff;
    }
    
    public void setLand(String Land)
    {
        land = Land;
    }
    
    public String getLand()
    {
        return land;
    }
    
    public void setFly(String Fly)
    {
        fly = Fly;
    }
    
    public String getFly()
    {
        return fly;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s \n%s: %s \n%s: %s \n",
            "Takeoff", takeOff,
                "Land", land,
                    "Fly", fly);
    }
}
