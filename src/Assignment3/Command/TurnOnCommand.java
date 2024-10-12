package Assignment3.Command;

// Команда для включения телевизора
class TurnOnCommand implements Command {
    private final Television tv;

    public TurnOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn(); // Включаем телевизор
    }
}