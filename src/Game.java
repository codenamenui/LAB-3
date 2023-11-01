import java.util.Scanner;
import java.util.Random;

public class Game {

    Player player;
    Enemy enemy;
    Enemy enemies[];
    Skill skills[];
    Weapon weapons[];
    static Random rz = new Random();
    static Scanner sc = new Scanner(System.in);

    public Game() {
        System.out.print("Enter Player Name: ");
        this.player = new Player(sc.nextLine().trim(), 15, 5, 10);
        this.enemies = new Enemy[10];
        this.enemies[0] = new Enemy("Goblin", rand(10, 15), rand(1, 2), rand(3, 5));
        this.enemies[1] = new Enemy("Troll", rand(25, 35), rand(4, 6), rand(6, 9));
        this.enemies[2] = new Enemy("Ghost", rand(10, 15), rand(2, 4), rand(10, 12));
        this.enemies[3] = new Enemy("Slime", rand(20, 30), rand(1, 2), rand(6, 9));
        this.enemies[4] = new Enemy("Wolf", rand(20, 20), rand(7, 9), rand(3, 5));
        this.enemies[5] = new Enemy("Reaper", rand(40, 50), rand(10, 20), rand(3, 7));
        this.enemies[6] = new Enemy("Dragon", rand(100, 120), rand(30, 50), rand(8, 10));
        this.enemies[7] = new Enemy("Lich", rand(20, 25), rand(10, 15), rand(5, 10));
        this.enemies[8] = new Enemy("Hydra", rand(30, 50), rand(10, 20), rand(5, 8));
        this.enemies[9] = new Enemy("Demon Lord", rand(40, 60), rand(30, 40), rand(3, 10));
        this.skills = new Skill[5];
        this.skills[0] = new Skill("Fireball", 5, 3, 1.2);
        this.skills[1] = new Skill("Ice Spear", 6, 5, 1.2);
        this.skills[2] = new Skill("Explosion", 20, -5, 1);
        this.skills[3] = new Skill("Magic Missile", 3, 100, 1.4);
        this.skills[4] = new Skill("Iai", 0, 10, 3);
        this.weapons = new Weapon[5];
        this.weapons[0] = new Weapon("Excalibur", 30, 2);
        this.weapons[1] = new Weapon("Artemis' Bow", 30, 7);
        this.weapons[2] = new Weapon("Ragnarok", 100, -5);
        this.weapons[3] = new Weapon("Gungnir", 20, 15);
        this.weapons[4] = new Weapon("Eclipse Blade", 10, 4);
        sc.close();
    }

    private int rand(int min, int max)
    {
        return(Math.min(min, rz.nextInt(max) + 1));
    }

    public boolean menu() {
        while (true) 
        {
            System.out.println("Welcome To Dnd, " + this.player.name + "!");
            System.out.println("Do you want to start?");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.print("Choice: ");
            String choice = sc.nextLine();
            if (choice.equals("1"))
            {
                System.out.println("Good Luck!");
                break;
            }
            else if (choice.equals("2"))
            {
                System.out.println("Okay, take your time.");
            }
        }
        return true;
    }

    public int pickScenario() {
        int scenario = rz.nextInt(10) + 1;
        if (scenario <= 6)
        {
            return 1;
        }
        else if (scenario == 7)
        {
            return 2;
        }
        else if (scenario == 8)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }

    public void fight()
    {
        this.enemy = this.enemies[rz.nextInt(10)];
        while (true) 
        {
            this.player.show();
            System.out.println("Current Enemy:");
            this.enemy.show();
            int action = this.action();
            switch (action)
            {
                case 1:
                    player.attack(null, this.enemy);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public int action() {
        System.out.println("Choose your action!");
        System.out.println("[1] Attack");
        System.out.println("[2] Use Skill");
        System.out.println("[3] Change Weapon");
        System.out.println("[4] Rest");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public void getWeapon()
    {

    }

    public void getSkill()
    {

    }

    public void giveStat()
    {

    }
}