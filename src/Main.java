public class Main {

    static Game game = new Game();
    public static void main(String[] args) throws Exception {
        // Main Game Loop
        while (true) {
            game.menu();
            switch (game.pickScenario())
            {
                case 1:
                    game.fight();
                    break;
                case 2:
                    game.getWeapon();
                    break;
                case 3:
                    game.getSkill();
                    break;
                case 4:
                    game.giveStat();
                    break;
            }
        }
    }
}
