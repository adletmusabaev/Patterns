package Assignment4.Observer;

// Интерфейс Observer описывает метод обновления для подписчиков.
public interface Observer {
    void update(String category, String news); // Метод обновления подписчика.
}