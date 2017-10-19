public class WarriorWeapon extends Equipment
{

   private int damage;
 
   public WarriorWeapon(String name, String description, String type, int damage)
   {
      super(name,description,type);
      this.damage = damage;
   }

   public int getDamage()
   {
      return damage;
   }
   public String toString() {
      return this.getName() + "\n" + "Damage " + damage + "\n" + this.getDescription();
   }




















}

