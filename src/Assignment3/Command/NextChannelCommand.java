package Assignment3.Command;

// Команда для переключения на следующий канал
class NextChannelCommand implements Command {
    private final Television tv;

    public NextChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel(); // Переключаем на следующий канал
    }
}