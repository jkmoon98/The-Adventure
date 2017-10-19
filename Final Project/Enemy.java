public class Enemy 
{

   private String name;
   private int Hp;
   private int Mp;
   private int Intellect;
   private int Attack;
   private int Defense;
   private int Speed; 
   private String type;
   boolean isFriendly = false;
   
   public Enemy (String name, String type, int Hp, int Mp, int Attack, int Defense, int Speed, int Intellect)
   {
      this.name = name;
      this.type = type;
      this.Hp = Hp;
      this.Mp = Mp; 
      this.Attack = Attack;
      this.Defense = Defense; 
      this.Speed = Speed;
      this.Intellect = Intellect;
   
   }
   public void setType(String type)
   {
      this.type = type;
   
   }
   public void setHp(int Hp)
   {
      this.Hp = Hp;
   
   }
   public void setName(String newName)
   {
      name = newName;
   
   }

   public void  setMp(int Mp)
   {
      this.Mp = Mp;
   
   }
   public void  setAttack(int Attack)
   {
      this.Attack = Attack;
   
   }
   public void  setDefense(int Defense)
   {
      this.Defense = Defense;
   
   }
 
   public void  setSpeed(int Speed)
   {
      this.Speed = Speed;
   
   }
   public void  setIntellect(int Intellect)
   {
      this.Intellect = Intellect;
   
   
   }
      public String getType()
   {
   
      return type;
   }

   public int getHp()
   {
   
      return Hp;
   }
   public String getName()
   {
   
      return name;
   }

   public int getMp()
   {
   
      return Mp;
   
   }
   public int getAttack()
   {
      return Attack;
   
   }
   public int getDefense()
   {
      return Defense;
   
   }
 
   public int getSpeed()
   {
      return Speed;
   
   }
   public int getIntellect()
   {
      return Intellect;
   
   
   }
   
   public String toString()
    {
            return  "========================================================" + "\n" +
         	"#  " + name + "   #" + "\n" +
         	getHp() + "/" +  " HP" + "\n" +
            getMp() + "/" +  " MP" + "\n" +    
         	getAttack() + " Attack" + "\n" +
         	getDefense() + " Defense" + "\n" +
            getSpeed() + "/" +  " SP" + "\n" +
            getIntellect() + "/" +  " INT" + "\n" +
         
         	"========================================================";    
   }   


   public void setIsFriendly(boolean isFriendly)
   {
      this.isFriendly = isFriendly;
   }
   public boolean getisFriendly()
   {
      return isFriendly;
   }













}