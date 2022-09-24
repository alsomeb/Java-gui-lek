package classes;

import javax.swing.*;
import java.awt.*;

public class Footer extends JPanel{
    private JButton generatePersonButton;
    private JButton clearButton;

    public Footer(){
        this.setPreferredSize(new Dimension(400, 60));

        // Buttons
        generatePersonButton = new JButton("Generate");
        generatePersonButton.setFocusable(false);
        generatePersonButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(generatePersonButton);

        this.add(Box.createHorizontalStrut(20)); // Gap mellan knappar

        clearButton = new JButton("Clear");
        clearButton.setFocusable(false);
        clearButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(clearButton);


    }

    // Getters
    public JButton getGeneratePersonButton() {
        return generatePersonButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }
}
