
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
    private int money;
    
    public House(int attack, int defense, int stamina, int money)
    {
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;
        this.money = money;
        
        Wizard.setAttack(attack);
        Wizard.setDefense(defense);
        Wizard.setStamina(stamina);
    }
    
}
