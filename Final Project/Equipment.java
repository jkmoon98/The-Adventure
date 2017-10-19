import java.util.*;
public class Equipment{

   private String name;
   private String description;
   private String type;
   boolean equipped = false;
public Equipment(String name,String description, String type)
{
this.name = name;
this.description = description;
this.type = type;
}

   public String getName()
   {
      return name;
   }
   public String getDescription()
   {
      return description;
   }
   public String getType()
   {
      return type;
   }

   public String toString()
   {
      return name + "/n" + description;
   }

   public void setIsEquipped(boolean equipped)
   {
      this.equipped = equipped;
   }
   public boolean getIsEquipped()
   {
      return equipped;
   }

}