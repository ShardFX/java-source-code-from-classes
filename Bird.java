
public class Bird extends Animal implements Flyer
{
    private double takeOff;
    private double land;
    private double fly;
    private double buildNest;
    private double layEggs;
    private double eat;
    
    public Bird(double TakeOff, double Land, double Fly, double BuildNest,
        double LayEggs, double Eat)
    {
        TakeOff = takeOff;
        Land = land;
        Fly = fly;
        BuildNest = buildNest;
        LayEggs = layEggs;
        Eat = eat;
    }
    
    public void setTakeOff(double TakeOff)
    {
        TakeOff = takeOff;
    }
    
    public double getTakeOff()
    {
        return takeOff;
    }
    
    public void setLand(double Land)
    {
        Land = land;
    }
    
    public double getLand()
    {
        return land;
    }
    
    public void setFly(double Fly)
    {
        Fly = fly;
    }
    
    public double getFly()
    {
        return fly;
    }
    
    public void setBuildNest(double BuildNest)
    {
        BuildNest = buildNest;
    }
    
    public double getBuildNest()
    {
        return buildNest;
    }
    
    public void setLayEggs(double LayEggs)
    {
        LayEggs = layEggs;
    }
    
    public double getLayEggs()
    {
        return layEggs;
    }
    
    public void setEat(double Eat)
    {
        Eat = eat;
    }
    
    public double getEat()
    {
        return eat;
    }
    
}
