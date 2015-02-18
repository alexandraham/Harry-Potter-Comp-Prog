
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
    private static int money;
    private Wand w;
    private House h;
    
    public Wizard(String house, String wand)
    {
        if (house.equals("Gryffindor")) h = new Gryffindor();
        if (house.equals("Slytherin")) h = new Slytherin();
        if (house.equals("Ravenclaw")) h = new Ravenclaw();
        if (house.equals("Hufflepuff")) h = new Hufflepuff();
        
        if(wand.equals("Wand1")) w = new Wand1();
        if(wand.equals("Wand2")) w = new Wand2();
        if(wand.equals("Wand3")) w = new Wand3();
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
