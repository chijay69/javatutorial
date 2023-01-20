public class titusmain {
    public static void main(String[] args) {
        titus titusobj = new titus(10);

        for (int i = 0; i < 5; i++) {
            titusobj.add();
            System.out.printf("%s", titusobj);
        }
    }
}
