package Assignment3.Memento;

// Класс, управляющий сохранением и восстановлением состояния
class Caretaker {
    private TextMemento memento; // Сохраняет снимок состояния

    public void saveState(TextEditor editor) {
        memento = editor.save(); // Сохраняем текущее состояние редактора
    }

    public void restoreState(TextEditor editor) {
        editor.restore(memento); // Восстанавливаем состояние редактора
    }
}