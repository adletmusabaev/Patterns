package Assignment3.Memento;

// Класс, представляющий текстовый редактор
class TextEditor {
    private String text = ""; // Текущий текст

    public void addText(String newText) {
        text += newText; // Добавляем текст к текущему
    }

    public String getText() {
        return text; // Возвращаем текущий текст
    }

    public TextMemento save() {
        return new TextMemento(text); // Создаем снимок текущего текста
    }

    public void restore(TextMemento memento) {
        text = memento.getText(); // Восстанавливаем текст из снимка
    }
}