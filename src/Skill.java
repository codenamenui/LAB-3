public class Skill extends Buff {

    double multiplier;

    public Skill(String name, int dmg, int roll, double multiplier) {
        super(name, dmg, roll);
        this.multiplier = multiplier;
    }

    public void show() 
    {
        System.out.printf("%s : %d dmg %d roll %f multiplier\n", this.name, this.dmg, this.roll, this.multiplier);
    }
}
