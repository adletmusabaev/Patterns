package Assignment3.Memento;

// Основной класс для демонстрации паттерна "Снимок"
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(); // Создаем текстовый редактор
        Caretaker caretaker = new Caretaker(); // Создаем хранителя снимков

        editor.addText("Hello, "); // Добавляем текст
        System.out.println("Current Text: " + editor.getText());

        caretaker.saveState(editor); // Сохраняем состояние

        editor.addText("World!"); // Добавляем еще текста
        System.out.println("After adding text: " + editor.getText());

        caretaker.restoreState(editor); // Восстанавливаем состояние
        System.out.println("After restoring: " + editor.getText());
    }
}