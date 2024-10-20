package Assignment4.Observer;

// Класс NewsSubscriberTablet получает уведомления о всех новостях.
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Tablet subscriber received news: " + news);
    }
}
