public class SWEnemies extends Enemy
{
   private String location;

   public SWEnemies(String name, String  type, int Hp, int Mp, int Attack, int Defense, int Speed, int Intellect, String location)
   {
      super(name,type,Hp,Mp,Attack,Defense,Speed,Intellect);
      this.location = location;
   }
   public String getLocation()
   {
   return location;
   }
   public String toString()
   {
      return this.getName() + "\n" + this.getHp() + "/" + " HP" + " || " + this.getAttack() + " Damage" + location;
   }
}