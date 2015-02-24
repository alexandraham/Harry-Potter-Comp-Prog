
/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Wand
 
{   // instance variables - replace the example below with your own
    private int attack;
    private int stamina;
    private int defense;
    
    public Wand(int attack, int defense, int stamina)
    {
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;

    }
    
    public int getWandAttack()
    {
        return attack;
    }
    
    public int getWandDefense()
    {
        return defense;
    }
    
    public int getWandStamina()
    {
        return stamina;
    }
    
}
