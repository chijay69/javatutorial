import java.util.EnumSet;

public class apple {
    public static void main(String[] args) {
        for (appl people : appl.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

            System.out.println("\nAnd now for the range of constants\n");

            for (appl peopleAppl : EnumSet.range(appl.kelsey, appl.candy)) {
                System.out.printf("%s\t%s\t%s\n", peopleAppl, peopleAppl.getDesc(), peopleAppl.getYear());
            }
        }
    }
}
