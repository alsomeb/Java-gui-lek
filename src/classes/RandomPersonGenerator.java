package classes;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomPersonGenerator {

    public static Person randomPerson() throws FileNotFoundException {
        ArrayList<Person> persons = RandomPersonGenerator.getPersonListFromFile();
        int randomNr = randomNr(persons.size());
        return persons.get(randomNr);
    }


    private static ArrayList<Person> getPersonListFromFile() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/classes/names.txt"));
        ArrayList<Person> content = new ArrayList<>();

        while(scan.hasNextLine()) {
            String[] line = scan.nextLine().split(" ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);

            content.add(new Person(name, age));
        }

        return content;
    }

    private static int randomNr(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }


}
