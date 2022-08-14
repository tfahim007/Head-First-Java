/**
 * @author Tahmidul Islam
 */
public class Player {
    int guessedNumber = 0;
    boolean isRight = false;

    public void guess(){
        guessedNumber = (int) (Math.random() * 10);
        System.out.println("I’m guessing "+ guessedNumber);
    }
}
