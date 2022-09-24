package classes;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {
    public Header(){
        this.setPreferredSize(new Dimension(400,80));

        //Label
        JLabel titleText = new JLabel("Random Name Generator");
        titleText.setPreferredSize(new Dimension(250,80)); // får lite margin Top
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setForeground(Color.decode("#22a7f0"));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
