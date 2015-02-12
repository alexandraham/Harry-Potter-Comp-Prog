
import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class GameLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLogic
{
    Wizard w;
    int level;

    /**
     * Constructor for objects of class GameLogic
     */
    public GameLogic()
    {
        //place code here for intial choices: house, wand, etc...
        //store responses in variables,h and w (strings)
        w = new Wizard(h,w);
        level = 1;
    }
    
    public int level()
    {
        return level;
    }

    public void backgroundStory()
    {
        
         new Health();
    System.out.println("Hello, Welcome to Hogwarts! What is your name?");
    Scanner read = new Scanner(System.in);
    String name = read.nextLine();
    System.out.println("Welcome to Hogwarts " + name+ ". You will now be sorted into your Hogwarts Houses.\nThe options are Gryffindor, Hufflepuff, Ravenclaw, and Slytherin");
    try {Thread.sleep(1500);
    } catch(Exception e) {}
    System.out.println("The Sorting Hat is thinking...");
    try {Thread.sleep(3000);
    } catch(Exception e) {}
    Random gen = new Random();
    int house = gen.nextInt(4);
    if(house==0)
    {
         System.out.println("Congratulations! You have been sorted into GRYFFINDOR! The house of the brave.");
        }
        else if(house==1)
        {
            System.out.println("Congratulations! You have been sorted into SLYTHERIN! The house of the cunning.");
        }
        else if(house==2)
        { 
            System.out.println("Congratulations! You have been sorted into RAVENCLAW! The house of the wise."); 
        }
        else
        {
             System.out.println("Congratulations! You have been sorted into HUFFLEPUFF! The house of the loyal.");
        }
}//welcome to...  
    public void battle(Obstacles o)
    {
        
        //if battle is lost, w.setStamina(
    }
    
    public void runObstacle()
    {
        
    }
}

