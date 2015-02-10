
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
    
    public Wand(int attack, int stamina, int defense)
    {
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;
    }
    
    public void setAttack(int x)
    {
        attack = attack + x;
    }
    
    public void setDefense(int x)
    {
        defense = defense + x;
    }
    
    public void setStamina(int x)
    {
        stamina = stamina + x;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDefense()
    {
        return defense;
    }
    
    public int getStamina()
    {
        return stamina;
    }
}
