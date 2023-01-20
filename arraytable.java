public class arraytable {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int bucky[] = {12, 16, 86, 21, 3};
        int sum=0;

        for(int counter=0; counter<bucky.length; counter++){
            sum += bucky[counter];

            System.out.println(counter + "\t" + bucky[counter]);
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
