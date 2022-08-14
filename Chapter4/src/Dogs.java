/**
 * @author Tahmidul Islam
 */
class Dogs {
    int size;
    String name;
    void bark() {
        if (size > 30) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Gheu! Gheu!");
        }
    }
}