
/**
 * Write a description of class Goblins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblins implements Obstacles
{
    private int power;
    public Goblins()
    {
        power = 30;
    }
      
    public void opt1Response(Wizard w)
    {
        w.setAttack(w.getAttack()-2);
        w.setMoney(w.getMoney()+5);
    }
    public void opt2Response(Wizard w)
    {
        w.setDefense(w.getDefense()-2);
        
    }
    public void opt3Response(Wizard w)
    {
        w.setMoney(w.getMoney()-5);
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
