package Assignment4.State;

// Состояние PausedState — плеер на паузе.
public class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Resuming playback."); // Возобновление воспроизведения.
        player.setState(new PlayingState());      // Переход в состояние воспроизведения.
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already paused."); // Плеер уже на паузе.
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback."); // Остановка воспроизведения.
        player.setState(new StoppedState());      // Переход в состояние остановки.
    }
}