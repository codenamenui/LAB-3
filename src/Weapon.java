public class Weapon extends Buff{
    public Weapon(String name, int dmg, int roll) {
        super(name, dmg, roll);
    }

    public void show()
    {
        System.out.printf("%s: %d dmg %d roll", this.name, this.dmg, this.roll);
    }
}