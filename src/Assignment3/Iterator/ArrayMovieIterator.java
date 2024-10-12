package Assignment3.Iterator;

// Итератор для коллекции фильмов, хранящихся в массиве
class ArrayMovieIterator implements Iterator<String> {
    private final String[] movies;
    private int position = 0; // Текущая позиция в массиве

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length; // Проверяем, есть ли еще фильмы
    }

    @Override
    public String next() {
        return movies[position++]; // Возвращаем текущий фильм и увеличиваем позицию
    }
}