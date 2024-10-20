package Assignment4.State;

// Класс Player управляет состоянием плеера.
public class Player {
    private PlayerState state;

    public Player() {
        state = new StoppedState(); // По умолчанию плеер в состоянии остановки.
    }

    public void setState(PlayerState state) {
        this.state = state; // Установка текущего состояния.
    }

    // Методы для управления плеером.
    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
