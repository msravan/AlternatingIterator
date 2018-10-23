import java.util.Iterator;
public class AlternatingIterator<E> implements Iterator {
    private Iterator<E>[]  iterators;
    private int nextIterator = 0;

    public AlternatingIterator(Iterator<E> ... iterators) {
        this.iterators = iterators;
        if (!iterators[0].hasNext())
            getNextIterator();
    }

    @Override
    public boolean hasNext() {
        return iterators[nextIterator].hasNext();
    }

    @Override
    public E next() {
        E element = iterators[nextIterator].next();
        getNextIterator();
        return element;
    }

    private void getNextIterator() {
        int currentIterator = nextIterator;
        do {
            nextIterator = (nextIterator + 1) % iterators.length;
        } while (!iterators[nextIterator].hasNext() && nextIterator != currentIterator);
    }
}