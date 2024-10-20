package Assignment4.Observer;

// Класс NewsSubscriberLaptop получает уведомления только о новостях категории "Наука".
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if ("Наука".equals(category)) {
            System.out.println("Laptop subscriber received science news: " + news);
        }
    }
}