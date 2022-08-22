package BattleShip;

import java.util.ArrayList;

/**
 * @author Tahmidul Islam
 */
class Startup {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    public void setLocationCells(ArrayList<String> locs) {

        locationCells = locs;
    }
    public String checkYourself(int guess) {
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } // end if
        } // end for
        if (numOfHits ==
                locationCells.length) {
            result = "kill";
        } // end if
        System.out.println(result);
        return result;
    }
}
