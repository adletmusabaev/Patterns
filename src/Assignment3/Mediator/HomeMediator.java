package Assignment3.Mediator;

// Интерфейс посредника
interface HomeMediator {
    void collectData(String data); // Собирает данные от сенсоров
    void printReport(); // Выводит отчет
}