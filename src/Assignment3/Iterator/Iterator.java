package Assignment3.Iterator;

// Интерфейс итератора
interface Iterator<T> {
    boolean hasNext(); // Проверяет, есть ли еще элементы
    T next(); // Возвращает следующий элемент
}