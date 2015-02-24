
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import javax.swing.*;
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
    String househ;
    String wandtype;
    //JFrame s;
    static JLabel stats; 
    public static void main()
    {
       JFrame statistics = new JFrame();
       stats =new JLabel();
       statistics.setLayout(new BorderLayout());
       statistics.add(stats, BorderLayout.CENTER);
       stats.setSize(400,100);
       stats.setFont(new Font("Arial", Font.BOLD, 25));
       //stats.setText("<html>HEALTH:               100<br>STAMINA:           100</html>");
       //healthnum.setFont(new Font("Arial", Font.PLAIN,12));
       //health.add(healthnum, BorderLayout.CENTER);
       //healthnum.setText("100");
       stats.setVisible(true); 
    }
    
    public static void setStats(int a, int b)
    {
        stats.setText("<html>HEALTH:               "+ a +"<br>STAMINA:           "+ b + "</html>");
    }

    /**
     * Constructor for objects of class GameLogic
     */
    public GameLogic()
    {
        //place code here for intial choices: house, wand, etc...
        //store responses in variables,h and w (strings)
        w = new Wizard(househ,wandtype);
        level = 1;
    }

    public int level()
    {
        return level;
    }

    public void backgroundStory()
    {

        // new Health();
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
            househ = "Gryffindor";
        }
        else if(house==1)
        {
            System.out.println("Congratulations! You have been sorted into SLYTHERIN! The house of the cunning.");
            househ= "Slytherin";
        }
        else if(house==2)
        { 
            System.out.println("Congratulations! You have been sorted into RAVENCLAW! The house of the wise."); 
            househ= "Ravenclaw";
        }
        else
        {
            System.out.println("Congratulations! You have been sorted into HUFFLEPUFF! The house of the loyal.");
            househ= "Hufflepuff";
        }
        
        System.out.println("Now you will be given a wand!");
        try {Thread.sleep(1000);
        } catch(Exception e) {}
        System.out.println("The wand is choosing the wizard...");
        try {Thread.sleep(2000);
        } catch(Exception e) {}
        int wand = gen.nextInt(3);
        if(wand==0) 
        {
            System.out.println("Your wand has a core of unicorn hair. It excels at charms!");
            wandtype="charms";
        }
         if(wand==1) 
        {
            System.out.println("Your wand has a core of a phoenix feather. It excels at defense!");
            wandtype="defense";
        }
         if(wand==2) 
        {
            System.out.println("Your wand has a core dragon heart string. It helps preserve your stamina!");
            wandtype="stamina";
        }
    }
    
    //welcome to...  
    public void battle(Obstacles o)
    {

        //if battle is lost, w.setStamina(
    }

    public void runObstacle()
    {

    }
}

