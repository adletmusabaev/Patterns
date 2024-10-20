package Assignment4.Observer;

// Главный класс Main для создания издателя и подписчиков, а также для публикации новостей.
public class Main {
    public static void main(String[] args) {
        NewsPublisherImpl publisher = new NewsPublisherImpl(); // Создание издателя новостей.

        // Создание подписчиков.
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Добавление подписчиков к издателю.
        publisher.addObserver(smartphoneSubscriber);
        publisher.addObserver(laptopSubscriber);
        publisher.addObserver(tabletSubscriber);

        // Публикация новостей.
        publisher.publishNews("Спорт", "New sports event happened!");
        publisher.publishNews("Наука", "Scientific discovery announced!");
        publisher.publishNews("Политика", "New political changes.");
    }
}