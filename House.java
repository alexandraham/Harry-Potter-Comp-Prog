
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class House
{
    private int attack;
    private int stamina;
    private int defense;
    
    public House(int attack, int defense, int stamina)
    {
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;
       
    }
    
    public int getHouseAttack()
    {
        return attack;
    }
    
    public int getHouseDefense()
    {
        return defense;
    }
    
    public int getHouseStamina()
    {
        return stamina;
    }
}
