package Assignment3.Mediator;

// Сенсор влажности
class HumiditySensor implements Sensor {
    private final HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "Humidity: 45%";
        mediator.collectData(data); // Отправка данных посреднику
    }
}