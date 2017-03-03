
public class Kryptonian extends Animal
{
    private String leapBuilding;
    private String stopBullet;
    
    public Kryptonian(String Eat, String leap, String stop)
    {
        Animal(eat);
        leapBuilding = leap;
        stopBullet = stop;
    }
    
    public void setLeapBuilding(String leap)
    {
        leapBuilding = leap;
    }
    
    public String getLeapBuilding()
    {
        return leapBuilding;
    }
    
    public void setStopBullet(String stop)
    {
        stopBullet = stop;
    }
    
    public String getStopBullet()
    {
        return stopBullet;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s \n%s: %s\n %s: %s\n",
            "Eat", super(eat),
                "LeapBuilding", leapBuilding,
                    "StopBullet", stopBullet);
    }
}
