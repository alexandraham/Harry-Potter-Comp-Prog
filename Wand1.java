
/**
 * Write a description of class Wand1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wand1 extends Wand
{
    private int attack = 100;
    private int defense = 75;
    private int stamina = 50;

    public Wand1()
    {
       super(0,0,0);
    }
    
    public Wand1(int attack, int defense, int stamina)
    {
        super(attack, defense, stamina);
    }
}
