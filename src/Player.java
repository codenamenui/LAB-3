import java.util.Random;

public class Player extends Entity{

    int roll;
    Weapon weapons[];
    Weapon weapon;
    Skill skills[];
    Random roller;
    final int ROLLS = 3;

    public Player(String name, int health, int dmg, int roll) {
        super(name, health, dmg);
        this.roll = roll;
        this.weapon = new Weapon("Fist", 0, 0);
        this.weapons = new Weapon[1];
        this.weapons[0] = this.weapon;
        this.skills = new Skill[0];
        this.roller = new Random();
    }

    void attack(Skill skill, Enemy entity) {
        if (skill == null)
        {
            dmg = this.dmg + this.weapon.dmg;
        }
        else
        {
            dmg = (int) ((this.dmg + this.weapon.dmg + skill.dmg) * skill.multiplier);
        }
        int gameRoll = 0;
        for (int i = 0; i < this.ROLLS; i++)
        {
            gameRoll += this.roller.nextInt(8) + 1; 
        }
        
        int playerRoll = 0;
        for (int i = 0; i < this.ROLLS - 1; i++)
        {
            playerRoll += this.roller.nextInt(this.roll) + 1; 
        }
        
        int enemyRoll = 0;
        for (int i = 0; i < this.ROLLS - 1; i++)
        {
            enemyRoll += this.roller.nextInt(entity.rollDef) + 1; 
        }
        
        System.err.printf("You rolled a %d against a %d!", playerRoll, enemyRoll);
        
        if (playerRoll > enemyRoll)
        {
            if (gameRoll < playerRoll)
            {
                System.out.println("You landed a successful attack!");
                super.attack(dmg, entity);
            } 
            else
            {
                System.out.println("You missed your attack!");
            }
        }
        else
        {
            System.out.println("Your enemy resisted the attack!");
        }
    }

    void add(Skill skill) {
        int length = this.skills.length;
        Skill buf[] = this.skills;
        this.skills = new Skill[length + 1];
        for (int i = 0; i < length; i++) {
            this.skills[i] = buf[i];
        }
        this.skills[length] = skill;
    }
    
    void add(Weapon weapon) {
        int length = this.weapons.length;
        Weapon buf[] = this.weapons;
        this.weapons = new Weapon[length + 1];
        for (int i = 0; i < length; i++) {
            this.weapons[i] = buf[i];
        }
        this.weapons[length] = weapon;
    }
    
    @Override
    void show() {
        super.show();
        System.out.printf("Current Weapon: %s +%d dmg +%d roll", this.weapon, this.weapon.dmg, this.weapon.roll);
    }
}
