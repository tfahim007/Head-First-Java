/**
 * @author Tahmidul Islam
 */
public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}
class Monster {
    boolean frighten(int a){
        System.out.println("arrrrgh");
        return false;
    }
}
class Vampire extends Monster {
    boolean frighten(int a){
        System.out.println("a bite?");
        return true;
    }
}
class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}