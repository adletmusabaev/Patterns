package Assignment3.Iterator;


// Коллекция фильмов на основе массива Array
class ArrayMovieCollection {
    private final String[] movies;

    public ArrayMovieCollection(String[] movies) {
        this.movies = movies;
    }

    // Создаем итератор для этой коллекции
    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}
