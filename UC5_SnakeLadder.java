public class UC5_SnakeLadder {
    public static void main(String[] args)
    {
         int maxPosition = 100;
        int samePosition = 0;
        int forward = 1;
        int backward = 2;
        int currentPosition = 1;
        int newPosition;

        

            while (currentPosition <= maxPosition) {
                int dice = (int) (Math.random() * 10) % 6 + 1;
                System.out.println("You got " + dice + " in dice roll.");
                newPosition = currentPosition + dice;

                if (newPosition == 100) {
                    currentPosition = currentPosition - dice;
                    System.out.println("Congratulations You Won the Game Your at 100 position :)");
                    break;
                } else if (newPosition > 100) {
                    System.out.println("You Got No Option stay in same Position.");
                    System.out.println("Your current Position is: " + currentPosition);
                    continue;
                }


                int options = 0;
                if (options == samePosition) {
                    System.out.println("You Got No Option Stay in the Same Place.");
                } else if (options == forward) {
                    currentPosition = currentPosition + dice;
                    System.out.println("You Got Ladder Your Moving Forward by " + dice + " numbers.");
                } else if (options == backward) {
                    currentPosition = currentPosition - dice;
                    System.out.println("You Got Snakebite Your Moving Backward by " + dice + " numbers.");
                }


                if (currentPosition <= 0) {
                    currentPosition =0;
                    System.out.println("You lost the Game Your at 0 position. Restarting the Game :");
                }
                System.out.println("Your current Position is: " + currentPosition);

            }
        }
    }
