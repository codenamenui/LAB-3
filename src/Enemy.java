public class Enemy extends Entity{
    
    int rollDef;

    public Enemy(String name, int health, int dmg, int rollDef)
    {
        super(name, health, dmg);
        this.rollDef = rollDef;
    }

}
