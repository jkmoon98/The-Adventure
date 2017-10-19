public class Armor extends Equipment 
{

   private int protection;
 
   public Armor(String name, String description, String type, int protection)
   {
      super(name,description,type);
      this.protection = protection;
   }

   public int getProtection()
   {
      return protection;
   }
   public void setProtection(int protection)
   {
       this.protection = protection;
   }

   public String toString() {
      return this.getName() + "\n" + "Protection " + protection + "\n" + this.getDescription();
   }

}


