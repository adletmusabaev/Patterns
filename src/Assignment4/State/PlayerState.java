package Assignment4.State;

// Интерфейс PlayerState описывает состояния плеера.
public interface PlayerState {
    void play(Player player);  // Метод для воспроизведения.
    void pause(Player player); // Метод для паузы.
    void stop(Player player);  // Метод для остановки.
}