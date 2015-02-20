
/**
 * Abstract class Wizard - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Wizard 
{
    private int attack;
    private int defense;
    private int stamina;
    private int money;
    private Wand w;
    private House h;
    
    public Wizard(String house, String wand, int coin)
    {
        if (house.equals("Gryffindor")) h = new Gryffindor();
        if (house.equals("Slytherin")) h = new Slytherin();
        if (house.equals("Ravenclaw")) h = new Ravenclaw();
        if (house.equals("Hufflepuff")) h = new Hufflepuff();
        
        if(wand.equals("Wand1")) w = new Wand1();
        if(wand.equals("Wand2")) w = new Wand2();
        if(wand.equals("Wand3")) w = new Wand3();
        
        coin = 25;
    }
    
    
    public void setAttack(int x)
    {
        attack += w.getAttack();
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
