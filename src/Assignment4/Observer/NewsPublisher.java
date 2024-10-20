package Assignment4.Observer;

// Интерфейс NewsPublisher описывает методы управления подписчиками.
public interface NewsPublisher {
    void addObserver(Observer observer);      // Добавить подписчика.
    void removeObserver(Observer observer);   // Удалить подписчика.
    void notifyObservers(String category, String news); // Уведомить всех подписчиков.
}