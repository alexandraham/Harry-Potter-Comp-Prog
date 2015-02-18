
/**
 * Write a description of class Fluffy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fluffy implements Obstacles
{
    // instance variables - replace the example below with your own
    private int power;
    
    public Fluffy()
    {
        power = 10;
    }
    public static void main(String[]args)
    {
        System.out.println("You have encountered Voldemort! What would you like to do?\n1. Stupefy\n2. Confundus\n3. Expelliarmus");
    }
    public void opt1Response(Wizard w)
    {
        w.setAttack(w.getAttack() +1);
        w.setDefense(w.getDefense() +1);
        w.setStamina(w.getStamina()+1);
    }
    public void opt2Response(Wizard w)
    {
        w.setAttack(w.getAttack()-1);
        
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

