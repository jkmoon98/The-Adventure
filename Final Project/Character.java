import java.util.*;
public class Character 
{
   private String name;
   private String newName;
   private int currentHp;
   private int currentMp;
   private int currentIntellect;
   private int currentAttack;
   private int currentDefense;
   private int currentSpeed; 
   private int Hp;
   private int Mp;
   private int Intellect;
   private int Attack;
   private int Defense;
   private int Speed; 
   private int level;
   private ArrayList<Equipment> inventory = new ArrayList();



   public Character (String name, int level, int currentHp, int currentMp, int currentAttack, int currentDefense, int currentSpeed, int currentIntellect)
   {
      this.name = name;
      this.level = level;
      this.currentHp = currentHp;
      this.currentMp = currentMp; 
      this.currentAttack = currentAttack;
      this.currentDefense = currentDefense; 
      this.currentSpeed = currentSpeed;
      this.currentIntellect = currentIntellect;
   
   }
   public void setlevel(int level)
   {
      this.level = level;
   }
   public void setCurrentHp(int currentHp)
   {
      this.currentHp = currentHp;
   
   }
   public void setName(String newName)
   {
      name = newName;
   
   }

   public void  setCurrentMp(int currentMp)
   {
      this.currentMp = currentMp;
   
   }
   public void  setCurrentAttack(int currentAttack)
   {
      this.currentAttack = currentAttack;
   
   }
   public void  setCurrentDefense(int currentDefense)
   {
      this.currentDefense = currentDefense;
   
   }
 
   public void  setCurrentSpeed(int currentSpeed)
   {
      this.currentSpeed = currentSpeed;
   
   }
   public void  setCurrentIntellect(int currentIntellect)
   {
      this.currentIntellect = currentIntellect;
   
   
   }
   public int getLevel()
   {
      return level;
   }

   public int getCurrentHp()
   {
   
      return currentHp;
   }
   public String getName()
   {
   
      return name;
   }

   public int getCurrentMp()
   {
   
      return currentMp;
   
   }
   public int getCurrentAttack()
   {
      return currentAttack;
   
   }
   public int getCurrentDefense()
   {
      return currentDefense;
   
   }
 
   public int getCurrentSpeed()
   {
      return currentSpeed;
   
   }
   public int getCurrentIntellect()
   {
      return currentIntellect;
   
   
   }

   public void loseHp(int Hp)
   {
      setCurrentHp(currentHp - Hp);
   
   
   }

   public void loseMp(int Mp)
   {
      setCurrentMp(currentMp - Mp);
   
   
   }

   public void loseAttack(int Attack)
   {
      setCurrentAttack(currentAttack - Attack);
   
   
   }

   public void loseDefense(int Defense)
   {
      setCurrentDefense(currentDefense - Defense);
   
   
   }

   public void loseSpeed(int Speed)
   {
      setCurrentSpeed(currentSpeed - Speed);
   
   
   }

   public void loseIntellect(int Intellect)
   {
      setCurrentIntellect(currentIntellect - Intellect);
   
   }

   public void addHp(int Hp)
   {
      setCurrentHp(currentHp + Hp);
   
   
   }

   public void addMp(int Mp)
   {
      setCurrentMp(currentMp + Mp);
   
   
   }

   public void addAttack(int Attack)
   {
      setCurrentAttack(currentAttack + Attack);
   
   
   }

   public void addDefense(int Defense)
   {
      setCurrentDefense(currentDefense + Defense);
   
   
   }

   public void addSpeed(int Speed)
   {
      setCurrentSpeed(currentSpeed + Speed);
   
   
   }

   public void addIntellect(int Intellect)
   {
      setCurrentIntellect(currentIntellect + Intellect);
   
   }
   public ArrayList<Equipment> getInventory()
   {
      return inventory;
   }
   public ArrayList<Equipment> getWarriorWeaponList()
   {
      ArrayList temp = new ArrayList<Equipment>();
      for(int i =0; i<inventory.size(); i++)
      {
         if(inventory.get(i).getType().equals("WarriorWeapon"))
            temp.add(inventory.get(i));
      }
      return temp;
   }
   public ArrayList<Equipment> getArcherWeaponList()
   {
      ArrayList temp = new ArrayList<Equipment>();
      for(int i =0; i<inventory.size(); i++)
      {
         if(inventory.get(i).getType().equals("ArcherWeapon"))
            temp.add(inventory.get(i));
      }
      return temp;
   }
    
   public ArrayList<Equipment> getMagicianWeaponList()
   {
      ArrayList temp = new ArrayList<Equipment>();
      for(int i =0; i<inventory.size(); i++)
      {
         if(inventory.get(i).getType().equals("MagicianWeapon"))
            temp.add(inventory.get(i));
      }
      return temp;
   }
     


   public String toString()
   {
      return  "========================================================" + "\n" +
         	"#  " + name + "   #" + "\n" +
         	getCurrentHp() + "/" +  " HP" + "\n" +
            getCurrentMp() + "/" +  " MP" + "\n" +    
         	getCurrentAttack() + " Attack" + "\n" +
         	getCurrentDefense() + " Defense" + "\n" +
            getCurrentSpeed() + "/" +  " SP" + "\n" +
            getCurrentIntellect() + "/" +  " INT" + "\n" +
         
         	"========================================================";    
   }

   public void addStats(Equipment x)
   {

      if (x.getType().equals("WarriorWeapon"))
      {
         currentAttack += ((WarriorWeapon)x).getDamage();
         //System.out.println("GET NEW ATTACK: " + currentAttack);//tester
      }
      if (x.getType().equals("MagicianWeapon"))
      {
         currentAttack += ((MagicianWeapon)x).getDamage();
         //System.out.println("GET NEW ATTACK: " + currentAttack);//tester
      }
      if (x.getType().equals("ArcherWeapon"))
      {
      
         currentAttack += ((ArcherWeapon)x).getDamage();
         //System.out.println("GET NEW ATTACK: " + currentAttack);//tester
      }
   
         
   }
   public void removeStats(Equipment x)
   {
      if (x.getType().equals("WarriorWeapon"))
      {
         currentAttack -= ((WarriorWeapon)x).getDamage();
      }
              if (x.getType().equals("MagicicianWeapon"))
      {
         currentAttack -= ((MagicianWeapon)x).getDamage();
      }      if (x.getType().equals("ArcherWeapon"))
      {
         currentAttack -= ((ArcherWeapon)x).getDamage();
      } 
         
   }
   public void printEquipment()
   {
      int slotNumber =0;
      for (Equipment i : inventory)
      {
      
         System.out.println("-------------------------------------------");
      
         System.out.println((slotNumber) + i.toString());
      
      }
      System.out.println("-------------------------------------------");
      slotNumber++;
   
   }
   public Equipment getItem(int place)
   {
      return inventory.get(place);
   }

   public void equip(Equipment item)
   {
   //Goes through every item in the player's inventory
      for(Equipment i : inventory)
      {
      //If the items occupy the same type slot and the inventory item is currently equipped,
         if(i.getName().equals(item.getName()) && i.getIsEquipped()==true)
         {
         //Unequip the inventory item and equip the given item.
            i.setIsEquipped(false);
            removeStats(i);
            System.out.println("remove STATS"); //tester
         }
         else
         {
            System.out.println("ADD STATS"); //tester
            item.setIsEquipped(true);
            addStats(item);
         }
      
      }
      System.out.println(item);
   }
   public void addItemInInventory(Equipment x)
   {
      inventory.add(x);
   }




















































































































}