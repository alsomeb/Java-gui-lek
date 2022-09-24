package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;


public class RandomNameGuiApp extends JFrame{
    private Header header;
    private Body body;
    private Footer footer;

    // The buttons we need to generate persons
    private JButton generatePersonBtn;

    private JButton clearButton;

    private int generatedPersonCount; // Hålla koll hur många person som genereras, så vi kan stänga av / sätta på knappen osv.


    public RandomNameGuiApp() {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("img/person.png").getImage());

        header = new Header();
        body = new Body();
        footer = new Footer();

        this.add(header, BorderLayout.NORTH);
        this.add(body, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);

        generatePersonBtn = footer.getGeneratePersonButton();
        clearButton = footer.getClearButton();

        addEventListeners();

        this.setVisible(true); // Funkar bara längst ner ?

    }

    private void addEventListeners() {

        generatePersonBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                generatedPersonCount++;
                addPersons();
            }

        });


        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                body.deleteAllPersons();
                revalidate(); // Googla ?
                repaint(); // Behövs båda iaf ?
                setGeneratedPersonCount(0);
                generatePersonBtn.setEnabled(true);
            }

        });
    }


    // Metod som används ovan, för att göra det mer lättläst
    public void addPersons() {
        if(generatedPersonCount <= 20) {
            try {
                GeneratedPerson newPerson = new GeneratedPerson();
                body.add(newPerson); // Lägger in personen i body
                revalidate(); // så screen uppdateras
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            generatePersonBtn.setEnabled(false);
        }
    }


    public void setGeneratedPersonCount(int generatedPersonCount) {
        this.generatedPersonCount = generatedPersonCount;
    }
}
