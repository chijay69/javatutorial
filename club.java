public class club {
    private String first;
    private String last;
    private static int members = 0;

    public club(String firstname, String lastname) {
        first = firstname;
        last = lastname;
        members++;
        System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public static int getMembers() {
        return members;
    }
}
