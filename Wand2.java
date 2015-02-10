
/**
 * Write a description of class Wand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wand2 extends Wand
{
    private int attack = 75;
    private int defense = 100;
    private int stamina = 50;

    public Wand2()
    {
       super(0,0,0);
    }
    
    public Wand2(int attack, int defense, int stamina)
    {
        super(attack, defense, stamina);
        this.setAttack(attack);
        
    }
    
}
