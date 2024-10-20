package Assignment4.Observer;
import java.util.ArrayList;
import java.util.List;

// Класс NewsPublisherImpl управляет списком подписчиков и отправляет уведомления.
public class NewsPublisherImpl implements NewsPublisher {
    private final List<Observer> observers = new ArrayList<>(); // Список подписчиков.

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer); // Добавление подписчика.
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer); // Удаление подписчика.
    }

    @Override
    public void notifyObservers(String category, String news) {
        // Уведомление всех подписчиков о новой новости.
        for (Observer observer : observers) {
            observer.update(category, news);
        }
    }

    // Публикация новости и уведомление подписчиков.
    public void publishNews(String category, String news) {
        notifyObservers(category, news);
    }
}
