package Assignment3.Mediator;

// Реализация посредника
class HomeMediatorImpl implements HomeMediator {
    private String temperatureData;
    private String humidityData;
    private String lightData;

    @Override
    public void collectData(String data) {
        // Сбор данных от разных сенсоров в зависимости от типа
        if (data.startsWith("Temperature")) {
            temperatureData = data;
        } else if (data.startsWith("Humidity")) {
            humidityData = data;
        } else if (data.startsWith("Light")) {
            lightData = data;
        }
    }

    @Override
    public void printReport() {
        // Вывод собранных данных
        System.out.println("Home Sensor Report:");
        System.out.println(temperatureData);
        System.out.println(humidityData);
        System.out.println(lightData);
    }
}