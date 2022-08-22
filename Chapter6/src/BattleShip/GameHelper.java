package BattleShip;

import java.util.Scanner;

/**
 * @author Tahmidul Islam
 */
public class GameHelper {
    public static Scanner obj = new Scanner(System.in);

    public int getUserInput(String prompt) {
        System.out.println(prompt);


        return obj.nextInt();


    }
}
