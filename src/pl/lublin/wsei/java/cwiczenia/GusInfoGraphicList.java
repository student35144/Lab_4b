package pl.lublin.wsei.java.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GusInfoGraphicList {
    public ArrayList<Infografika> infografiki;

    public GusInfoGraphicList(String plik) {
        infografiki = new ArrayList<>();
        String zawartoscPliku;

        try {
            zawartoscPliku = new String(Files.readAllBytes(Paths.get(plik)));
        }
        catch (IOException exception) {
            System.out.println("Błąd wczytywania pliku => " + exception.getLocalizedMessage());
            exception.printStackTrace();
            zawartoscPliku = "";
        }

        String[] items = zawartoscPliku.split("<item>");
        for (int i = 1; i < items.length; i++) {
            infografiki.add(new Infografika(items[i]));
        }
    }
}
