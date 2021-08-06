public class UC3_SnakeLadder {
    public static void main(String[] args) {

        int Player = 0;


        {
            int Dice = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("Dice value is " + Dice);
            int type = (int) (Math.random() * 10) % 3 + 1;
            switch (type) {
                case 1:
                    System.out.println("You are in same place");
                    break;

                case 2:

                    if (Player >= 100) {
                        Player = (Player + Dice);

                    }
                    System.out.println("You got Ladder now Player goes up to :" + Player);


                case 3:
                    Player = (Player - Dice);
                    if (Player < 100) {
                        Player = (Player - Dice);
                    }
                    System.out.println("You got snake Player goes down to :" + Player);

            }
        }
    }
}