
/**
 * Write a description of class DevilsSnare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DevilsSnare implements Obstacles
{
    private int power;
    public DevilsSnare()
    {
        power = 20;
    }
    public static void main(String[]args)
    {
        System.out.println("You have encountered the Devil's Snare! What would you like to do?\n1. Panic\n2. calm\n3. Sunlight spell\n4. Slash with a knife");
    }
    public void opt1Response(Wizard w)
    {
        w.setAttack(w.getAttack()-2);
        w.setDefense(w.getDefense()-2);
        w.setStamina(w.getStamina()-2);
    }
    public void opt2Response(Wizard w)
    {
        w.setDefense(w.getDefense()-1);
    }
    public void opt3Response(Wizard w)
    {
        w.setStamina(w.getStamina()-1);
        
    }
    public void opt4Response(Wizard w)
    {
        w.setDefense(w.getDefense()-1);
        
    }
    public int getPower()
    {
        return power;
    }
}
