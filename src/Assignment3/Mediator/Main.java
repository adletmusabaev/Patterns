package Assignment3.Mediator;

// Основной класс для демонстрации паттерна "Посредник"
public class Main {
    public static void main(String[] args) {
        // Создаем посредника
        HomeMediator mediator = new HomeMediatorImpl();

        // Создаем сенсоры и передаем посредника
        Sensor temperatureSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        // Отправляем данные от сенсоров
        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Выводим отчет о состоянии дома
        mediator.printReport();
    }
}