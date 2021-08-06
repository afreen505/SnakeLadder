public class UC4_SnakeLadder {
    public static int maxPosition = 100;
    public static int samePosition = 0;
    public static int forward = 1;
    public static int backward = 2;
    public static int currentPosition;

    public static void main(String[] args) {

        while (currentPosition <= maxPosition) {

            int dice = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("You got " + dice + " in dice roll.");

            int Dice = (int) (Math.random() * 10) % 6 + 1;
            int options = 0;
            if (options == samePosition) {
                System.out.println("You Got No Option Stay in the Same Place.");
            }
            else if (options == forward) {
                currentPosition = currentPosition + dice;
                System.out.println("You Got Ladder Your Moving Forward by " + dice + " numbers.");
            } else if (options == backward) {
                currentPosition = currentPosition - dice;
                System.out.println("You Got Snakebite Your Moving Backward by " + dice + " numbers.");
            }
            if (currentPosition >= 100) {
                System.out.println("Congratulations You Won the Game Your at 100 position :)");
                break;
            }
            else if (currentPosition <= 0) {
                System.out.println("You lost the Game Your at 0 position. Restarting the Game :");
                currentPosition = 0;
            }

        }
    }
}
