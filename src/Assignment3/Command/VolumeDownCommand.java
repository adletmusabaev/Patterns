package Assignment3.Command;

// Команда для уменьшения громкости
class VolumeDownCommand implements Command {
    private final Television tv;

    public VolumeDownCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown(); // Уменьшаем громкость
    }
}