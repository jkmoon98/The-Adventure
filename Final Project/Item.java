public class Item extends Equipment 
{

   private int effect;
 
   public Item(String name, String description, String type, int effect)
   {
      super(name,description,type);
      this.effect = effect;
   }

   public int getEffect()
   {
      return effect;
   }
   /*
   public void useItem(Item x, Character c)
   {
   if(x.getType().equals("healthPotion"))
   {
  	c.addHp(x.getEffect());
   // c.removeEquipment(x);
	}

}
*/
   public String toString() {
      return this.getName() + "\n" + "Effect " + effect + "\n" + this.getDescription();
   }

}


