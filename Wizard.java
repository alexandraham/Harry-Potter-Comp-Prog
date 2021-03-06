
/**
 * Abstract class Wizard - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Wizard 
{
    private int attack;//instance field for constructing a wizard
    private int defense;
    private int stamina;
    private int money;
    private Wand w;
    private House h;

    public Wizard(String house, String wand)
    {
        if (house.equals("Gryffindor")) h = new Gryffindor();//create instance of Gryffindor class if paramter variable equals Gryffindor
        else if (house.equals("Slytherin")) h = new Slytherin();
        else if (house.equals("Ravenclaw")) h = new Ravenclaw();
        else if (house.equals("Hufflepuff")) h = new Hufflepuff();

        if(wand.equals("charms")) w = new Wand1();
        else if(wand.equals("defense")) w = new Wand2();
        else if(wand.equals("stamina")) w = new Wand3();

        money = 25;//initializes variable money to value of 25

        attack = attack + h.getHouseAttack() + w.getWandAttack();//variable attack initialized to value from taken from house and wand
        defense = defense + h.getHouseDefense() + w.getWandDefense();
        stamina = stamina + h.getHouseStamina() + w.getWandStamina();
    }

    public void setAttack(int x)
    {
        attack += x;//adds int x to initial value of attack and sets that value to attack
    }

    public void setDefense(int x)
    {
        defense += x;
    }

    public void setStamina(int x)
    {
        stamina += x;
    }

    public int getAttack()
    {
        return attack;//returrns value for attack
    }

    public int getDefense()
    {
        return defense;
    }

    public int getStamina()
    {
        return stamina;
    }

    public void setMoney(int x)
    {
        money = money+x;
    }

    public int getMoney()
    {
        return money;
    }

}
