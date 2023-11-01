public class Skill extends Buff {

    double multiplier;

    public Skill(String name, int dmg, int roll, double multiplier) {
        super(name, dmg, roll);
        this.multiplier = multiplier;
    }
}
