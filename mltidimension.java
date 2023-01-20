public class mltidimension {
    public static void main(String[] args) {
        int first[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
        int second[][] = { { 30, 31, 32, 33 }, { 0, 43 }, { 4, 5, 6 } };
        System.out.println("This is the first array");
        display(first);
        System.out.println("This is the second array");
        display(second);
    }

    public static void display(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
