
/**
 * Write a description of class Voldemort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Voldemort implements Obstacles

{
    // instance variables - replace the example below with your own
    private int power;
    private Wizard w;
    
    public Voldemort()
    {
        power = 50;
    }
    public static void main(String[]args)
    {
        System.out.println("You have encountered Voldemort! What would you like to do?\n1. Stupefy\n2. Confundus\n3. Expelliarmus\n4. Slap him");
    }
    public void opt1Response(Wizard w)
    {
        w.setStamina(w.getStamina()-1);
        
    }
    public void opt2Response(Wizard w)
    {
        w.setAttack(w.getAttack()-1);
        w.setStamina(w.getStamina()-1);
    }
    public void opt3Response(Wizard w)
    {
        w.setStamina(w.getStamina()+3);
        w.setAttack(w.getAttack()+3);
        w.setDefense(w.getDefense()+3);
    }
    public void opt4Response(Wizard w)
    {
        w.setAttack(w.getAttack() -5);
        w.setDefense(w.getDefense() -5);
        w.setStamina(w.getStamina()-5);
    }
    public int getPower()
    {
        return power;
    }
}
