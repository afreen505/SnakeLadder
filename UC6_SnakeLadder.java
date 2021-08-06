public class UC6_SnakeLadder {
    public static int maxPosition = 100;
    public static int  samePosition = 0;
    public static int forward = 1;
    public static int backward = 2;

    public static void main(String[] args) {

        int currentPosition=1;
        int newPosition ;
        int numOfDiceRoll = 0;

        while (currentPosition <= maxPosition) {
            int dice = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("You got " + dice + " in dice roll.");
            dice = (int) (Math.random() * 10) % 3;


            newPosition = currentPosition + dice;
            numOfDiceRoll++;


            if (newPosition == maxPosition) {
                System.out.println("Congratulations You Won the Game Your at 100 position :)");
                System.out.println("Dice was rolled " + numOfDiceRoll + " times.");
                break;
            } else if (newPosition > maxPosition) {
                System.out.println("You Got No Option stay in same Position.");
                System.out.println("Your current Position is: " + currentPosition);

                continue;
            }

            int options=0;
            if (options == samePosition) {
                System.out.println("You Got No Option Stay in the Same Place.");
            } else if (options == forward) {
                currentPosition += dice;
                System.out.println("You Got Ladder Your Moving Forward by " + dice + " numbers.");
            } else if (options == backward) {
                currentPosition -= dice;
                System.out.println("You Got Snakebite Your Moving Backward by " + dice + " numbers.");
            }


            if (currentPosition <= 0) {
                System.out.println("You lost the Game Your at 0 position. Restarting the Game :(");
                currentPosition = 0;
            }

            System.out.println("Your current Position is: " + currentPosition);
            System.out.println("Dice was rolled " + numOfDiceRoll + " times.");
        }

    }

}
