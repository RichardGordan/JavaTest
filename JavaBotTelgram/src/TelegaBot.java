import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TelegaBot {
    public static void main(String[] args) {
// 5598009136:AAHq3ltKDnxa2mabHaVnA3NuFRIXqGoNVZQ

        TelegramBot bot = new TelegramBot("5598009136:AAHq3ltKDnxa2mabHaVnA3NuFRIXqGoNVZQ");


        bot.setUpdatesListener(updates -> {
            updates.forEach(upd -> {
                try {
                    System.out.println(upd);
                    long chatId = upd.message().chat().id();
                    String incomeMessage = upd.message().text();
                    String result;
                    if(incomeMessage.equalsIgnoreCase("/start")){
                        result = "Привет!" + "\n" + "Напиши номер и япришлю тебе новость! ";
                    }else {
                        int number = Integer.parseInt(incomeMessage);
                        Document doc = Jsoup.connect("https://lenta.ru/rss").get();
                        System.out.println(doc.title());
                        Elements items = doc.select("item");
                        int index = number - 1;
                        Element news = doc.select("item").get(index);
                        String category = news.select("category").text();
                        String title = news.select("title").text();
                        String link = news.select("link").text();
                        String description = news.select("description").text();
                        result = category + "\n" + title + "\n" + description + "\n" + link;
//                    Document doc = Jsoup.connect("https://www.cbr.ru/scripts/XML_daily.asp?date_req=" + incomeMessage).get();
//                    System.out.println(doc.title());
//                    Elements valutes = doc.select("Valute");
//                    String result = "";
//                    for (Element valute : valutes) {
//                        if(valute.attr("ID").equals("R01235")) {
//                             result = valute.select("Value").text();
//                            System.out.println(result);
//                        }
//                    }
                    }
                    SendMessage request = new SendMessage(chatId, result);
                    bot.execute(request);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            });

            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });


    }

}
