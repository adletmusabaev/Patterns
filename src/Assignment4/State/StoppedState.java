package Assignment4.State;

// Состояние StoppedState — плеер остановлен.
public class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Starting playback from the beginning."); // Начало воспроизведения.
        player.setState(new PlayingState());                         // Переход в состояние воспроизведения.
    }

    @Override
    public void pause(Player player) {
        System.out.println("Can't pause, playback is stopped."); // Невозможно поставить на паузу.
    }

    @Override
    public void stop(Player player) {
        System.out.println("Already stopped."); // Плеер уже остановлен.
    }
}