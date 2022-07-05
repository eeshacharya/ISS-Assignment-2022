package animals;

public class Mammals implements Animal 
{

   public void eat() 
   {
      System.out.println("Mammals have hair");
   }

   public void travel() 
   {
      System.out.println("Mammals are warm blooded");
   } 

   public int noOfLegs() 
   {
      return 0;
   }

   public static void main(String args[])
   {
      Mammals m = new Mammals();
      m.eat();
      m.travel();
   }
}