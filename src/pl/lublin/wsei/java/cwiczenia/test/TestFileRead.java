package pl.lublin.wsei.java.cwiczenia.test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {
    public static void main(String[] args) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("ZAWARTOŚĆ PLIKU gusInfoGraphic.xml");
            System.out.print(contents);
        }
        catch (IOException exception) {
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml => " + exception.getLocalizedMessage());
            exception.printStackTrace();
        }
    }

}
