public class titus {
    private int sum;
    private final int NUMBER;

    public titus(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("Total sum is %d\n", sum);
    }
}
