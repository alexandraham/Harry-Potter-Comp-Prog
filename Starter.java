

/*/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starter
{
    public static void main(String[] args)
    {
        
        GameLogic g = new GameLogic();
        g.backgroundStory();
        
        while(g.level()<=6) g.runObstacle();
    }
}
