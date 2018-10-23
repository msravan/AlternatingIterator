# Alternating Iterator

Implement an alternating iterator supporting the methods below.
```
public class AlternatingIterator<E> implements Iterator {
  public AlternatingIterator(Iterator<E> … iterators) {
  public boolean hasNext(){…}
  public E next() {…}
}
```
The AlternatingIterator should alternate in order between the iterators it receives in its constructor.
For example if constructed with three iterators [a,b,c], [1,2] and [x,y,z], the iterator should produce the elements in this order ‘a, 1, x, b, 2, y, c, z’

Unit tests for the ‘hasNext’ and ‘next’ methods