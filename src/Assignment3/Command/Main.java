package Assignment3.Command;

// Основной класс для демонстрации паттерна "Команда"
public class Main {
    public static void main(String[] args) {
        // Создаем телевизор
        Television tv = new Television();

        // Создаем пульт и привязываем команды к кнопкам
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, new TurnOnCommand(tv));     // Кнопка 0 - включить
        remote.setCommand(1, new TurnOffCommand(tv));    // Кнопка 1 - выключить
        remote.setCommand(2, new VolumeUpCommand(tv));   // Кнопка 2 - громкость вверх
        remote.setCommand(3, new VolumeDownCommand(tv)); // Кнопка 3 - громкость вниз
        remote.setCommand(4, new NextChannelCommand(tv)); // Кнопка 4 - следующий канал
        remote.setCommand(5, new PreviousChannelCommand(tv)); // Кнопка 5 - предыдущий канал

        // Тестируем команды
        remote.pressButton(0);  // Включаем телевизор
        remote.pressButton(2);  // Увеличиваем громкость
        remote.pressButton(4);  // Переключаем на следующий канал
        remote.pressButton(1);  // Выключаем телевизор
    }
}