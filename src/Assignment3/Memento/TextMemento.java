package Assignment3.Memento;

// Класс, представляющий снимок состояния текста
class TextMemento {
    private final String text; // Хранит текстовое состояние

    public TextMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text; // Возвращает сохраненный текст
    }
}