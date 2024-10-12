package Assignment3.Mediator;

// Сенсор освещенности
class LightSensor implements Sensor {
    private final HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "Light: 300 lx";
        mediator.collectData(data); // Отправка данных посреднику
    }
}