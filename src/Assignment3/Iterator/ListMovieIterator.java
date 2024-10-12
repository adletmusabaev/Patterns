package Assignment3.Iterator;
import java.util.List;
// Итератор для коллекции фильмов, хранящихся в списке List
class ListMovieIterator implements Iterator<String> {
    private final List<String> movies;
    private int position = 0; // Текущая позиция в списке

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.size(); // Проверяем, есть ли еще фильмы
    }

    @Override
    public String next() {
        return movies.get(position++); // Возвращаем текущий фильм и увеличиваем позицию
    }
}
