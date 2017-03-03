
public class Animal
{
   public String eat;
   
   public Animal(String Eat)
   {
       eat = Eat;
   }
   
   public void setEat(String Eat)
   {
       eat = Eat;
   }
    
   public String getEat()
   {
       return eat;
   }
   
   public String toString()
   {
       return String.format("%s: %s\n",
            "Eat", eat);
   }
}
