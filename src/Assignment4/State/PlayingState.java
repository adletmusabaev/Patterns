package Assignment4.State;

// Состояние PlayingState — плеер воспроизводит аудио.
public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Already playing."); // Плеер уже воспроизводит.
    }

    @Override
    public void pause(Player player) {
        System.out.println("Pausing playback."); // Пауза воспроизведения.
        player.setState(new PausedState());      // Переход в состояние паузы.
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback."); // Остановка воспроизведения.
        player.setState(new StoppedState());      // Переход в состояние остановки.
    }
}