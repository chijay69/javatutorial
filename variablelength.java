public class variablelength {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        int val = average(num);
        System.out.println(val);
    }

    public static int average(int... numbers) {
        int total = 0;
        for (int x : numbers) {
            total += x;
        }
        return total;
    }
}
