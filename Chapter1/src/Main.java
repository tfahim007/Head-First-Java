/**
 * @author Tahmidul Islam
 */

public class Main {

    public static void main(String[] args) {
        String[] wordListOne ={"Kick", "Sack", "Beat"};
        String[] wordListTwo ={"Sakib","Tamim","Mushfiq"};
        String[] wordListThree = {"Today", "Tomorrow", "Now"};

        int choiceOne = (int)(Math.random() * (int) wordListOne.length);
        int choiceTwo = (int)(Math.random() * (int) wordListTwo.length);
        int choiceThree = (int)(Math.random() * (int) wordListThree.length);

        String result = wordListOne[choiceOne] + " " + wordListTwo[choiceTwo] + " " +wordListThree[choiceThree];
        System.out.println(result);
    }
}