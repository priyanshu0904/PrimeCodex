public class DiceRoll {
    int roll(){
        int random = (int) Math.ceil(Math.random() * 6);
        return random;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to PrimeCodex Dice...\n");
        DiceRoll dice = new DiceRoll();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
