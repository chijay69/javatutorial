import javax.swing.JFrame;

public class guimain {
    public static void main(String[] args) {
        gui bucky = new gui();

        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bucky.setSize(275, 180);
        bucky.setVisible(true);
    }
}
