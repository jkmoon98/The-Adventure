import java.util.*;
public class World
{
   
   private String description;
   public World(String description)
   {
      this.description = description;
   }

   public String getDescription()
   {
      return description;
   }

   public String toString() {
      return "World" + ":" + description;
   }











}