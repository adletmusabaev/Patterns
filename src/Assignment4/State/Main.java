package Assignment4.State;

// Главный класс Main для переключения состояний плеера.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(); // Создание плеера.

        player.play();  // Воспроизведение.
        player.pause(); // Пауза.
        player.play();  // Возобновление воспроизведения.
        player.stop();  // Остановка.
    }
}