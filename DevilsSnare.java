
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
        w.setMoney(w.getMoney()-5);
    }
    public int getPower()
    {
        return power;
    }
}
