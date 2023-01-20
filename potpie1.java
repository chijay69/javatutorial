public class potpie1 {
    private String name;
    private potpie birthday;

    public potpie1(String nameString, potpie datePotpie) {
        name = nameString;
        birthday = datePotpie;
    }

    public String toString() {
        return String.format("My name is %s, my birthday is on %s", name, birthday);
    }
}
