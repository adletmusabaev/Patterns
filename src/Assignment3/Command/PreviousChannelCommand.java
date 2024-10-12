package Assignment3.Command;

// Команда для переключения на предыдущий канал
class PreviousChannelCommand implements Command {
    private final Television tv;

    public PreviousChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.previousChannel(); // Переключаем на предыдущий канал
    }
}