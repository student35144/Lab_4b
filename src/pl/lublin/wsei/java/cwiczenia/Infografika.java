package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul;
    public String adresStrony;
    public String adresGrafiki;
    public String adresMiniaturki;
    public Integer szerokosc;
    public Integer wysokosc;

    public Infografika(String tekst) {
        Pattern pattern = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]>");
        Matcher matcher = pattern.matcher(tekst);
        if (matcher.find())
            tytul = matcher.group(1);
        else
            tytul = "";

        pattern = Pattern.compile("<link>(.*)</link>");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            adresStrony = matcher.group(1);
        else
            adresStrony = "";

        pattern = Pattern.compile("<media:content url=\"(.*)\" type");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            adresGrafiki = matcher.group(1);
        else
            adresGrafiki = "";

        pattern = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            adresMiniaturki = matcher.group(1);
        else
            adresMiniaturki = "";

        pattern = Pattern.compile("width=\"(.*)\" height");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            szerokosc = Integer.parseInt(matcher.group(1));
        else
            szerokosc = 0;

        pattern = Pattern.compile("height=\"(.*)\"");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            wysokosc = Integer.parseInt(matcher.group(1));
        else
            wysokosc = 0;
    }

    public void Print() {
        System.out.println("Infografika:");
        System.out.println("\tTytuł: " + tytul);
        System.out.println("\tAdres strony: " + adresStrony);
        System.out.println("\tAdres grafiki: " + adresGrafiki);
        System.out.println("\tAdres miniaturki: " + adresMiniaturki);
        System.out.println("\tRozmiary: " + szerokosc + "x" + wysokosc);
        System.out.println("\n");
    }
}
