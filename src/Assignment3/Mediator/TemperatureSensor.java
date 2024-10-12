package Assignment3.Mediator;

// Сенсор температуры
class TemperatureSensor implements Sensor {
    private final HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "Temperature: 25°C";
        mediator.collectData(data); // Отправка данных посреднику
    }
}