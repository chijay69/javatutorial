import java.awt.*;
import javax.swing.*;

public class gui extends JFrame {
    private JLabel item1;

    public gui() {
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a sentence");
        item1.setToolTipText("This is going to show up on hover");
        add(item1);
    }
}
