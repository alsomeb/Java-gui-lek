package classes;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class GeneratedPerson extends JPanel {

    private JLabel person;

    public GeneratedPerson() throws FileNotFoundException {
        this.setPreferredSize(new Dimension(400, 20));
        this.setLayout(new BorderLayout());

        //Label
        person = new JLabel(randomPerson());
        person.setPreferredSize(new Dimension(200, 20));
        person.setHorizontalAlignment(JLabel.CENTER);

        this.add(person, BorderLayout.WEST);
    }

    public String randomPerson() throws FileNotFoundException {
        String name = RandomPersonGenerator.randomPerson().getName();
        int age = RandomPersonGenerator.randomPerson().getAge();
        return "Name: " + name + " " + " Age: " + age;
    }
}
