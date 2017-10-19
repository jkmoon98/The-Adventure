import java.util.*;
public class Tester
{

   public static void main (String[] args){
         Character jMoon = new Character("Jonathan Moon", 27, 200, 100, 20, 15, 20, 30);
      Game game= new Game(jMoon);
   
   

      Enemy keeper = new Enemy("Dungeon Keeper", "Medieval", 20, 0, 2, 0, 0, 0);
      game.getEnemy().add(keeper);
      Enemy guard = new Enemy("guard", "Medieval", 35, 0, 10, 10, 0, 0);
      game.getEnemy().add(guard);
      Enemy knight = new Enemy("Knight", "Medieval", 40, 0, 15, 10, 5, 5);
      game.getEnemy().add(knight);
      Enemy king = new Enemy("Boss: King", "Medieval", 100, 20, 25, 30, 10, 10);
      game.getEnemy().add(king);
   
      Enemy pikachu = new Enemy("Pikachu", "Pokemon", 50, 0, 10, 10, 20, 15);
      game.getEnemy().add(pikachu);
      Enemy meowth = new Enemy("Meowth", "Pokemon", 75, 0, 20, 10, 10, 20);
      game.getEnemy().add(meowth);
      Enemy teamRocket = new Enemy("Jesse and James", "Pokemon", 100, 0, 30, 15, 5, 0);
      game.getEnemy().add(teamRocket);
      Enemy piplup = new Enemy("Boss: Piplup", "Pokemon", 200, 0, 40, 20, 25, 15);
      game.getEnemy().add(piplup);
   
      Enemy stormTrooper = new Enemy("FN-2487", "Star Wars", 100, 0, 30, 30, 10, 5);
      game.getEnemy().add(stormTrooper);
      Enemy kyloRen = new Enemy("Kylo Ren", "Star Wars", 200, 0, 50, 40, 30, 20);
      game.getEnemy().add(kyloRen);
      Enemy jJBinks = new Enemy("Sith Lord Jar Jar Binks", "Star Wars", 300, 0, 60, 50, 50, 0);
      game.getEnemy().add(jJBinks);
      Enemy camden = new Enemy("BOSS: Dark Lord Camden Yi", "Star Wars", 1000000, 10000, 1000, 1000, 1000, 1000);
      game.getEnemy().add(camden);
   
      System.out.println(game.getWorlds().get(0));
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Congratulations. You have slain the keeper." + "\n" + "Now you can finally start your journey to make your way back to the real world." + "\n" +
          "Yes, that is right. You are trapped in the code itself of the forbidden game." + "\n" + "In order to escape this virtual horror you must alone complete the game and defeat the final boss." + "\n" +
          "Now do not waste anymore time. LETS GO!" + "\n" + 
           "========================================================");
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "After you escaped the dungeon, you find that you are in a medieval castle." + "\n" + "A guard spotted you! You must fight him!" + "\n" +
           "========================================================");
   
   
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Well done. You have defeated the court guard." + "As you fight your way through the world you will encounter stronger and more powerful enemies so precede with care." + "\n" +
          "You make your way through the castle and eventually find yourself in the throne room. The king resides in his throne before you, but his knight stands in your way." + "\n" +
          "Take him out!" + "\n" +
          "========================================================");
   
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Now that the knight is finished, only the king stands in your way." + "\n" + "This is your first boss battle so be extra cautious. Bosses are more difficult to defeat than regular enemies." + "\n" +
          "Its now or never J-Moon. If you defeat the king, you may move on to the next world." + "\n" + "Fight!" + "\n" +
          "========================================================");
   
   
      game.battle(jMoon,game.getEnemy());
      System.out.println(game.getWorlds().get(1));
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "You have made it to the second world of Pokemon. Be extremely careful." + "\n" + "Team Rocket may jump you at any moment." + "\n" + "Wait. What was that??" + "\n" +
          "A wild Pikachu appeared! Maybe you can take it down and capture it as your first pokemon." + "\n" + "Battle it!" + "\n" +
           "========================================================");
   
   
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "You demolished the Pikachu. It can no longer become your companion because of the amount of destruction you caused." + "\n" + "Oh well You must continue your journey to escape!" + "\n" +
          "You roam around every region of the Pokemon world, however, there are no Pokemon trainers in sight." + "\n" + "Just then, Meowth jumps you from inside the gym. There is an evil presence from the Meowth." + "\n" +
          "You must fight it!" + "\n" +
          "========================================================");
   
   
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Meowth has fainted." + "\n" + "Then from inside the gym, a man with blue hair and a woman with red hair appeared. Their shirts have a large letter R on them." + "\n" +
          "You must battle them to further progress in your journey. They don’t appear to be using their Pokemon.. Nonetheless!" + "\n" + "You must still battle them with no mercy! Good luck!" + "\n" +
           "========================================================");
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Why they didnt use their pokemon? Who cares. You defeated them. On with the game." + "\n" + "After searching the entire map from the first pokemon game, you run into a Piplup." + "\n" +
          "This Piplup was slightly different from any other one. It is six feet tall and weighs a ton." + "\n" + "Looks like this is the boss of this world. Battle it with extreme caution." + "\n" +  
          "This battle decides wether you lose the game, or continue on to the final world. Fight!" + "\n" +
         "========================================================");
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Congratulations! You have successfully defeated the evils of the Pokemon world! Now all that is left is the Dark side of this game." + "\n" + "Continue on J-Moon, to defeat all sith lords and escape this game." + "\n" +
         "========================================================");
      System.out.println(game.getWorlds().get(2));
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "You have made it. The last world of the game. The Death Star." + "\n" + "Do not worry. It is only the most difficult world to beat in the entire game. Thousands of stormtroopers and a handful of Sith Lords. How hard can it be?" + "\n" +
          "Look out! A stormtrooper has taken notice of you. Quickly! Take it out before any others are alerted." + "\n" +
          "========================================================");
   
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "Phew! That was a close one." + "\n" + "Now keep going deeper into the base. You must find and defeat the boss in order to escape." + "\n" +
          "You feel a shift in the force. The Dark is swaying your heart." + "\n" + "From the shadows Kylo Ren appears. Lightsaber drawn." + "\n" + "Quick! Draw out your lightsaber and rid the world of this evil!" + "\n" +
          "========================================================");
         
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "You have defeated Kylo Ren. All of a sudden you hear a loud cry of agony coming from deeper within the Death Star." + "\n" + "There is no doubt about it. You are getting closer to the boss." + "\n" +
          "The closer and closer you get, the disturbance in the force grows stronger." + "\n" + "A figure leaps in front of you. Covered in a deathly black drape, Sith Lord Jar Jar Binks has revealed himself." + "\n" +
          "It is now or never J-Moon. Defeat the Sith Lord!" + "\n" +
          "========================================================");
   
      game.battle(jMoon,game.getEnemy());
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "This was easily your most challenging battle yet. But it is not over yet." + "\n" + "It is finally come. The last battle." + "\n" +
          "The last boss that stands in your way from freedom, from going back to your world. Within the resting chambers of the Dark Lord, Dark Lord Camden Yi awakens." + "\n" +
          "You just woke him up from his daily nap. He does not look too happy." + "\n" + "This is it J-Moon! Battle him with your best effort and grasp your victory!" + "\n" +
          "========================================================");
      System.out.println("========================================================" + "\n" +
          "#" + "   #" + "\n" +
          "You have done it! You’ve defeated all 3 bosses from all 3 worlds." + "\n" + "Congratulations with defeating the forbidden game and one more word before you leave to home, NEVER OPEN THIS GAME AGAIN!" + "\n" +
          "Farewell, J-Moon." + "\n" +
          "========================================================");
      
    
      
   
      
   
   
   
   
   
   
   
   }





}