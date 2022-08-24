import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Jsouptest {
    public static void main(String[] args) throws IOException {
        String date = "08/08/2022";
        int number = 1;
        Document doc = Jsoup.connect("https://lenta.ru/rss").get();
        System.out.println(doc.title());
        Elements items = doc.select("item");
        int index = number - 1;
       Element news = doc.select("item").get(index);
       String category = news.select("category").text();
        String title = news.select("title").text();
        String link = news.select("link").text();
        String description = news.select("description").text();
        String result = category + "\n" + title + "\n"+description+ "\n" + link;
        System.out.println(result);

    }
}