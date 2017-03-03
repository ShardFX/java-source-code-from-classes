
public class Superman extends Kryptonian implements Flyer
{
    private String takeOff;
    private String land;
    private String fly;
    private String leapBuilding;
    private String stopBullet;
    private String eat;
    
    public Superman(String TakeOff, String Land, String Fly, 
        String LeapBuilding, String StopBullet, String Eat)
    {
        super(takeOff, land, fly);
        super(leapBuilding, stopBullet);
        super(eat);
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
    
    public void setLeapBuilding(String LeapBuilding)
    {
        leapBuilding = LeapBuilding;
    }
    
    public String getLeapBuilding()
    {
        return leapBuilding;
    }
    
    public void setStopBullet(String StopBullet)
    {
        stopBullet = StopBullet;
    }
    
    public String getStopBullet()
    {
        return stopBullet;
    }
    
    public void setEat(String Eat)
    {
        Eat = eat;
    }
    
    public String getEat()
    {
        return eat;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s\n%s: %s\n %s: %s\n%s: %s \n%s: %s\n %s: %s\n",
            "TakeOff", super(takeOff),
                "Land", super(land),
                    "Fly", super(fly),
                        "LeapBuilding", super(leapBuilding),
                            "StopBullet", super(stopBullet),
                                "Eat:", super(eat));
    }
}
