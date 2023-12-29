import java.security.spec.RSAOtherPrimeInfo;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        int GuessNumber = (int) (Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {

            System.out.println("number to guess is: " + GuessNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            guessP2 = p2.number;
            guessP3 = p3.number;

            System.out.println("p1 player thinks that this is " + guessP1);
            System.out.println("p2 player thinks that this is " + guessP2);
            System.out.println("p3 player thinks that this is " + guessP3);


            if (guessP1 == GuessNumber)
                p1IsRight = true;
            else if (guessP2 == GuessNumber)
                 p2IsRight = true;
            else if (guessP3 == GuessNumber)
                p3IsRight = true;

            if (p1IsRight || p2IsRight || p3IsRight){

                System.out.println("we have a winner!");
                System.out.println("p1 is right? " + p1IsRight);
                System.out.println("p2 is right? " + p2IsRight);
                System.out.println("p3 is right? " + p3IsRight);
                System.out.println("game over");
                break;
            }
            else {
                System.out.println("try again...");
            }
        }
    }

}
