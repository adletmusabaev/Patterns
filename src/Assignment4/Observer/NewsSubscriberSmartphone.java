package Assignment4.Observer;

// Класс NewsSubscriberSmartphone получает уведомления только о новостях категории "Спорт".
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if ("Спорт".equals(category)) {
            System.out.println("Smartphone subscriber received sports news: " + news);
        }
    }
}