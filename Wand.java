
/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Wand
 
{   // instance variables
    private int attack;
    private int stamina;
    private int defense;
    
    public Wand(int attack, int defense, int stamina)
    {
        this.attack = attack;//instance variable attack is assigned to parameter variable attack
        this.defense = defense;
        this.stamina = stamina;

    }
    
    public int getWandAttack()
    {
        return attack;//returns attack value from wand
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
