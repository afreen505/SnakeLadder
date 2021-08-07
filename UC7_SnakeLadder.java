public class UC7_SnakeLadder {
    public static int maxPosition = 100;
    public static int samePosition;
    public static int forward;
    public static int backward;
    public static int options1;
    public static int options2;


    public static void main(String[] args)
    {
        System.out.println("-------------------------------------");
        int player1Position = 1;
        int player2Position =1;
        int newPositionPlayer1=1 ;
        int newPositionPlayer2=1 ;
        int numOfDiceRoll = 0;
        while (player1Position <= maxPosition || (player2Position > maxPosition)) {
            int dice1 = (int) (Math.random() * 10) % 6;
            int dice2 = (int) (Math.random() * 10) % 6;
            System.out.println("Player 1 got " + dice1 + " in dice roll.");
            System.out.println("Player 2 got " + dice2 + " in dice roll.");
            newPositionPlayer1 = player1Position + dice1;
            newPositionPlayer2 = player2Position + dice2;
            numOfDiceRoll++;


            if (newPositionPlayer1 == maxPosition) {
                System.out.println("Congratulations Player 1 Won the Game :)");
                System.out.println("Dice was rolled " + numOfDiceRoll + " times.");
                break;
            } else if (newPositionPlayer1 > maxPosition) {
                System.out.println("Player 1 Got No Option stay in same Position.");
                System.out.println("Player 2 current Position is: " + player1Position);
                System.out.println("-------------------------------------");                     //For Separation
                continue;
            }

            if (newPositionPlayer2 == maxPosition) {
                System.out.println("Congratulations Player 2 Won the Game :)");
                System.out.println("Dice was rolled " + numOfDiceRoll + " times.");
                break;
            } else if (newPositionPlayer2 > maxPosition) {
                System.out.println("Player 2 Got No Option stay in same Position.");
                System.out.println("Player 2 current Position is: " + player2Position);
                System.out.println("-------------------------------------");                     //For Separation
                continue;
            }

            //For Player 1
            if (options1 == samePosition) {
                System.out.println("Player 1 Got No Option Stay in the Same Place.");
            } else if (options1 == forward) {
                player1Position += dice1;
                System.out.println("Player 1 Got Ladder Your Moving Forward by " + dice1 + " numbers.");
            } else if (options1 == backward) {
                player1Position -= dice1;
                System.out.println("Player 1 Got Snakebite Your Moving Backward by " + dice1 + " numbers.");
            }

            //For Player 2
            if (options2 == samePosition) {
                System.out.println("Player 2 Got No Option Stay in the Same Place.");
            } else if (options2 == forward) {
                player2Position += dice2;
                System.out.println("Player 2 Got Ladder Your Moving Forward by " + dice2 + " numbers.");
            } else if (options2 == backward) {
                player2Position -= dice2;
                System.out.println("Player 2 Got Snakebite Your Moving Backward by " + dice2 + " numbers.");
            }

            if (player1Position <= 0) {
                System.out.println("Player 1 lost the Game. Player 1 is at 0 position. Restarting the Game for player 1 :(");
                player1Position = player1Position - player1Position;
            }
            if (player2Position <= 0) {
                System.out.println("Player 2 lost the Game. Player 2 is at 0 position. Restarting the Game for player 2 :(");

            }
            System.out.println("Player 1 current Position is: " + player1Position);
            System.out.println("Player 2 current Position is: " + player2Position);
            System.out.println("Dice was rolled " + numOfDiceRoll + " times.");
            System.out.println("-------------------------------------");

        }
    }
}
