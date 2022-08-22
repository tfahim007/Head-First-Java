package BattleShip;

/**
 * @author Tahmidul Islam
 */
public class StartUpGame {
    public static void main(String[] args) {
        int  numberOfGuesses = 0;

        Startup obj = new Startup();
        GameHelper gameHelper = new GameHelper();
        int rand = (int) (Math.random()*5);
        int[] locations = {rand,rand+1,rand+2};

        obj.setLocationCells(locations);

        boolean isAlive = true;
        while(isAlive){
            int guess = gameHelper.getUserInput("Enter a number");
            String result = obj.checkYourself(guess);
            numberOfGuesses++;
            if(result=="kill"){
                isAlive = false;
                System.out.printf("You have won! You took %d gueeses",numberOfGuesses);

            }
        }


    }
}
