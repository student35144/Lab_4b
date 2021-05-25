package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {
    public static void main(String[] args) {
        String testString = "\t\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Narodowy Spis Ludności i Mieszkań 2021]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Thu, 01 Apr 2021 07:30:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-narodowy-spis-ludnosci-i-mieszkan-2021,102,1.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-narodowy-spis-ludnosci-i-mieszkan-2021,102,1.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/102/1/1/nsp_2021_infografika_slajder.png\" type=\"image/png\" width=\"590\" height=\"331\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/102/1/1/nsp_2021_infografika_slajder,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/102/1/1/nsp_2021_infografika_slajder,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";

        Infografika infografika = new Infografika(testString);
        System.out.println("Tytuł: " + infografika.tytul);
        System.out.println("Adres strony: " + infografika.adresStrony);
        System.out.println("Adres grafiki: " + infografika.adresGrafiki);
        System.out.println("Adres miniaturki: " + infografika.adresMiniaturki);
        System.out.println("Rozmiary: " + infografika.szerokosc + "x" + infografika.wysokosc);
    }
}
