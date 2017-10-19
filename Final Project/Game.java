import java.util.*;
public class Game 
{
   private ArrayList<World> worlds;
   private ArrayList<Enemy> e;
   
   public Game(Character c)
   
   {
      worlds= new ArrayList<World>();
      e = new ArrayList<Enemy>();
      World medieval = new World("medieval");
      worlds.add(0,medieval);
      World pokemon = new World("pokemon");
      worlds.add(1,pokemon);
      World starwars = new World("starwars");
      worlds.add(2,starwars);
System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Your name is Jonathan Moon." + "\n" + "One day you were in your AP Computer Science class and found a hidden file on a school computer." + "\n" +  
          "The file was called the forbidden game." + "\n" +
            " Your teacher warned you that it was an unfinished file of code originally started by a past student he had." + "\n" +
            "The student had worked on it all four years during high school, but not one person on campus knows what he was coding except that it was some sort of game" + "\n" +
            "You decided to finally find out what the game was and opened the code and ran it."
+ "\n" +
            "The moment you right-clicked the run button you were knocked out and woke up to find yourself trapped in a dungeon." + "\n"
             + " You awake to the sounds of heavy footsteps approaching." + "\n" +
"The dungeon keeper approaches with an executioners axe." + "\n" +
            "Fight him!" + "\n" +

          "========================================================");

         WarriorWeapon lightSaber = new WarriorWeapon("light saber", "A saber of various colored lights.", "WarriorWeapon", 27);
      (c.getInventory()).add(lightSaber);
      WarriorWeapon thorHammer = new WarriorWeapon("thors hammer", "No one can wield besides the ruler of Asgard himself. Wait. Then how are you using it?", "WarriorWeapon", 40);
      (c.getInventory()).add(thorHammer);
   
      MagicianWeapon kameha  = new MagicianWeapon("kamehameha", "Goku sans favorite move", "MagicianWeapon", 100);
      (c.getInventory()).add(kameha);
      MagicianWeapon kiss  = new MagicianWeapon("tempting kiss", "Was once used on the legendary Jmoon himself and consumed his soul making him vulnerably naive", "MagicianWeapon", 5);
      (c.getInventory()).add(kiss);
   
   
      ArcherWeapon ak = new ArcherWeapon("ak 47", "gratata. Terrorists use this thing too much.", "ArcherWeapon", 7);
      (c.getInventory()).add(ak);
      ArcherWeapon batarang = new ArcherWeapon("batarang", "Hand crafted by Morgan Freeman", "ArcherWeapon", 5);
      (c.getInventory()).add(batarang);
   
   
      
      //setWorlds();
      
   }
   public ArrayList<World> getWorlds()
   {
      return worlds;
   }
   public ArrayList<Enemy> getEnemy()
   {
      return e;
   }

   public void battle(Character c, ArrayList<Enemy> e)
   {
   
   
      Scanner scan = new Scanner(System.in);
      boolean IsRun = false;
   
      while(c.getCurrentHp() >0 && e.get(0).getHp() >0 && IsRun==false)
      {
      
      
         System.out.println(c);
         System.out.println(e.get(0));
         System.out.println("What action will you do? \n Attack \n Do nothing \n Use item \n block\n Run");
      	 
         String user = scan.nextLine();
         user = user.toLowerCase();
      
         if (user.equals("attack"))
         {
            playerAttack(c,e);
            System.out.println("you just attacked.");
            enemyAttack(c,e);
            System.out.println("The enemy just attacked.");
         }
         if (user.equals("do nothing"))
         {
            DoNothing();
            System.out.println("you just did nothing.");
            enemyAttack(c,e);
            System.out.println("The enemy just attacked.");
         }
         if (user.equals("run"))
         {
            System.out.println("you ran away.");
            IsRun =true;
         }
         if (user.equals("block"))
         {
            if (c.getCurrentSpeed() > e.get(0).getSpeed())
            {
               playerBlock(c,e);
            }
            else
            {
            
               enemyAttack(c,e);
               System.out.println("The enemy just attacked.");
            }
         }
         if (user.equals("use item"))
         {
            playerItem(c);
         }
      
      }
   
      if(c.getCurrentHp()==0)
         System.out.println("You have died.");
      else
         System.out.println("You have won.");
      e.remove(0);
//       System.out.println("The enemy just dropped an item");
//       System.out.println("Do you want to pick it up");
//       String user = scan.nextLine();
//       user = user.toLowerCase();
//       if(user.equals("yes"))
//       
//       {
//       Item gumbo = new Item("gumbo", "Restores 200 health lost to the user", "healthPotion", 200);
// 
//          c.equip(gumbo);
//       }
   }

   public void playerAttack(Character c, ArrayList<Enemy> e)
   {
   
      e.get(0).setHp(e.get(0).getHp() - c.getCurrentAttack());
   
   }
   public void enemyAttack(Character c,ArrayList<Enemy> e)
   {
   
      c.setCurrentHp(c.getCurrentHp() - e.get(0).getAttack());
   
   }
   public void playerBlock(Character c, ArrayList<Enemy> e)
   {
   
      System.out.println("You just blocked");
   
   }
   
   public void playerItem(Character c)
   {
      System.out.println("INVENTORY: " + c.getInventory());
      System.out.println("Which item would you like to use");
      Scanner scan = new Scanner(System.in);
      String user = scan.nextLine();
      user = user.toLowerCase();
      for (int i=0; i <c.getInventory().size(); i++)
      {
         if(user.equals(c.getInventory().get(i).getName()))
            c.equip(c.getInventory().get(i));
         System.out.println("IS EQUIPPED? " + c.getInventory().get(i).getIsEquipped()); //tester
      }
      for (int i=0; i<c.getArcherWeaponList().size(); i++)
      {
         if(user.equals(c.getArcherWeaponList().get(i).getName()))
            c.equip(c.getArcherWeaponList().get(i));
         System.out.println("IS EQUIPPED? " + c.getArcherWeaponList().get(i).getIsEquipped()); //tester
      }
   
      for (int i=0; i<c.getMagicianWeaponList().size(); i++)
      {
         if(user.equals(c.getMagicianWeaponList().get(i).getName()))
            c.equip(c.getMagicianWeaponList().get(i));
         System.out.println("IS EQUIPPED? " + c.getMagicianWeaponList().get(i).getIsEquipped()); //tester
      }
   }
   public void DoNothing()
   {
   }
 

  /**public ArrayList setWorlds()
   {
      int x = (int)(Math.random() *3 );
      int[] numbersUsed = new int[3];
      World forest = new World("forest");
      worlds.set(x, forest);
      numbersUsed[x]=x;
   
      x = (int)(Math.random() *3 ) ;
   
      while (numbersUsed[x]==x)//checks for valid number
      {
         x = (int)(Math.random() *3 ) ;
      }
   
      World school = new World("school");
      worlds.set(x, school);
      numbersUsed[x]=x;
      
      while (numbersUsed[x]==x)//checks for valid number
      {
         x = (int)(Math.random() *3 ) ;
      }
   
   
      World castle = new World("castle");
      worlds.set(x, castle); 
      return worlds;
    }
    **/
    
}


































































  



      
