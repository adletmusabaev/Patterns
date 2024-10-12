package Assignment3.Iterator;
import java.util.List;
// Коллекция фильмов на основе списка List
class ListMovieCollection {
    private final List<String> movies;

    public ListMovieCollection(List<String> movies) {
        this.movies = movies;
    }

    // Создаем итератор для этой коллекции
    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}