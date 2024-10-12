package Assignment3.Iterator;
import java.util.List;

// Основной класс для демонстрации паттерна "Итератор"
public class Main {
    public static void main(String[] args) {
        // Коллекция фильмов на основе списка
        ListMovieCollection listCollection = new ListMovieCollection(List.of("Movie 1", "Movie 2", "Movie 3"));
        // Коллекция фильмов на основе массива
        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(new String[]{"Movie A", "Movie B", "Movie C"});

        // Итерация по фильмам из списка
        System.out.println("Movies from List:");
        Iterator<String> listIterator = listCollection.createIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Итерация по фильмам из массива
        System.out.println("\nMovies from Array:");
        Iterator<String> arrayIterator = arrayCollection.createIterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}