package pl.lublin.wsei.java.cwiczenia.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {
    public static void main(String[] args) {
        String exItem = "\t\t<item>\n" +
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

        Pattern pattern = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher matcher = pattern.matcher(exItem);
        if (matcher.find())
            System.out.println("Znaleziono tytuł: " + matcher.group(1));
        else
            System.out.println("Nie znaleziono tytułu...");
    }
}