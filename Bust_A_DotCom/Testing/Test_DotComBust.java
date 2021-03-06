import java.util.*;

public class Test_DotComBust {

    private GameHelper helper = new GameHelper();

    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    private int numOfGuesses = 0;

    private String userGuess = null;

    private void setUpGame() {

        //first make some dot coms and give them locations.

        DotCom one = new DotCom();

        one.setName("Pets.com");

        DotCom two = new DotCom();

        two.setName("eToys.com");

        DotCom three = new DotCom();

        three.setName("Go2.com");

        dotComsList.add(one);

        dotComsList.add(two);

        dotComsList.add(three);

        for (DotCom dotComToSet : dotComsList) {

            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCells(newLocation);

        } //close for loop

    } //close setUpGame method

    private void startPlaying() {

        while(!dotComsList.isEmpty() ) {

            String userGuess = helper.getUserInput("Enter a guess.");

            checkUserGuess(userGuess);

        } //close while

        finishGame();

    } //close startPlaying method

    private void checkUserGuess(String userGuess) {

        numOfGuesses++;

        String result = "Miss.";

        for (int x = 0; x < dotComsList.size(); x++) {

            result = dotComsList.get(x).checkYourself(userGuess);

            if (result.equals("Hit.") ) {

                break;

            }

            if (result.equals("Kill.") ) {

                dotComsList.remove(x);

                break;

            }

        } //close for

        System.out.println(result);

    } //close method

    private void finishGame() {

        System.out.println("All Dot Coms are dead!  Your stocks are now worthless.");

        if (numOfGuesses == 9) {

            System.out.println("It only took you " + numOfGuesses + " guesses!?");  

            System.out.println("Okay hotshot, who showed you the board?!");

        } else if (numOfGuesses <= 16) {

            System.out.println("It only took you " + numOfGuesses +" guesses.");

            System.out.println("You got out before your options sank.");

        } else if (numOfGuesses <= 32) {

            System.out.println("It only took you " + numOfGuesses +" guesses.");

            System.out.println("Glass half-full, glass half-empty.  Which way do you drink?");

        } else if (numOfGuesses <= 48) {

            System.out.println("It only took you " + numOfGuesses +" guesses.");

            System.out.println("Fish are dancing with your options.");

        } else if (numOfGuesses == 49) {

            System.out.println("It only took you " + numOfGuesses + " guesses!?");  

            System.out.println("Wow.  Just...  Wow.");

        }

    } // Close method.

    public static void main (String[] args) {

        DotComBust game = new DotComBust();

        game.setUpGame();

        game.startPlaying();

    } // Close method.

}

            

            
