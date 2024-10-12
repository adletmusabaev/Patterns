package Assignment3.Command;

// Команда для выключения телевизора
class TurnOffCommand implements Command {
    private final Television tv;

    public TurnOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff(); // Выключаем телевизор
    }
}