public class Entity {

    String name;
    int totalHealth;
    int currentHealth;
    int dmg;

    public Entity(String name, int health, int dmg) {
        this.name = name;
        this.totalHealth = health;
        this.currentHealth = health;
        this.dmg = dmg;
    }

    void show() {
        System.out.printf("%s: %d/%d\n", this.name, this.currentHealth, this.totalHealth);
    }

    void attack(int dmg, Entity entity) {
        entity.currentHealth -= dmg;
        System.out.printf("%s has attacked %s for %d damage!\n", this.name, entity.name, dmg);
    }
}
