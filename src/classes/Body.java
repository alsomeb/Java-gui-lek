package classes;

import javax.swing.*;
import java.awt.*;

public class Body extends JPanel {
    public Body(){
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(10); // space mellan cols
        this.setLayout(layout); // Sets the layout manager for this container
        this.setBackground(Color.decode("#E6D79E"));
    }

    public void deleteAllPersons() {
        this.removeAll();
    }
}
