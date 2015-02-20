
/**
 * Write a description of class Troll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Troll implements Obstacles


{
    // instance variables - replace the example below with your own
    private int power;
    private Wizard w;
    /**
     * Constructor for objects of class Troll
     */
    public Troll()
    {
        // initialise instance variables
        power = 40;
    }
    public static void main(String[]args)
    {
        System.out.println("You have encountered a Troll! What would you like to do?\n1. Perform an attack spell\n2. Run around\n3. Stupefy\n4. Buy a sleeping draught");
    }
    public void opt1Response(Wizard w)
    {
        w.setAttack(w.getAttack() +1);
        w.setDefense(w.getDefense() -2);
        w.setStamina(w.getStamina()-2);
    }
    public void opt2Response(Wizard w)
    {
        w.setAttack(w.getAttack()-1);
        w.setDefense(w.getDefense() -2);
        w.setStamina(w.getStamina()-2); 
    }
    public void opt3Response(Wizard w)
    {
        w.setStamina(w.getStamina()-1);
        w.setAttack(w.getAttack() +1);
        w.setDefense(w.getDefense() +1);
    }
    public void opt4Response(Wizard w)
    {
        //w.setMoney(w.getMoney()-3);
        w.setDefense(w.getDefense() +1);
    }
    public int getPower()
    {
        return power;
    }

}
