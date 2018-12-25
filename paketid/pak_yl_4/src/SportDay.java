import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SportDay {
    public static void main(String[] args) {
        SortableList<Athlete> athletes;

        try {
            File dataFile = new File("athletes.txt");
            FileInputStream fileInput = new FileInputStream(dataFile);
            ObjectInputStream reader = new ObjectInputStream(fileInput);
            athletes = (SortableList<Athlete>) reader.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            athletes = new SortableList<Athlete>();
            athletes.add(new Athlete("Mati", 5.6));
            athletes.add(new Athlete("Kati", 1.6));
            athletes.add(new Athlete("Kertu", 7.6));
        }

//        Collections.sort(athletes);
        athletes.sort();

        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }

        try {
            File dataFile = new File("athletes.txt");
            FileOutputStream fileOutput = new FileOutputStream(dataFile);
            ObjectOutputStream saver = new ObjectOutputStream(fileOutput);
            saver.writeObject(athletes);
            saver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
