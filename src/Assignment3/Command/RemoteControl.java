package Assignment3.Command;

// Класс, представляющий пульт управления
class RemoteControl {
    private final Command[] buttons = new Command[6]; // Массив кнопок для команд

    // Устанавливаем команду на определенную кнопку
    public void setCommand(int buttonNumber, Command command) {
        buttons[buttonNumber] = command;
    }

    // Нажимаем кнопку и выполняем команду
    public void pressButton(int buttonNumber) {
        buttons[buttonNumber].execute();
    }
}