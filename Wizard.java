
/**
 * Abstract class Wizard - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Wizard 
{
    private static int attack;
    private static int defense;
    private static int stamina;
    private Wand w;
    private House h;
    
    public Wizard(String house, String wand)
    {
        //if house.equals(Gryffindor) h = new Gryffindor();
        //by the end, all variables above have been initialized
        //if(wand.equals
        
    }
    
    static void setAttack(int x)
    {
        attack = attack + x;
    }
    
    static void setDefense(int x)
    {
        defense = defense + x;
    }
    
    static void setStamina(int x)
    {
        stamina = stamina + x;
    }
    
    static int getAttack()
    {
        return attack;
    }
    
    static int getDefense()
    {
        return defense;
    }
    
    static int getStamina()
    {
        return stamina;
    }

}
