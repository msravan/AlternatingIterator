import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AlternatingIteratorTest {

    @Test
    public void testHasNextWithNoElements() {
        ArrayList alist1 = new ArrayList();
        Iterator itr1 = alist1.iterator();

        ArrayList alist2 = new ArrayList();
        Iterator itr2 = alist2.iterator();

        AlternatingIterator alternatingIterator1 = new AlternatingIterator(itr1, itr2);

        assertEquals(false, alternatingIterator1.hasNext());
        assertFalse(alternatingIterator1.hasNext());
    }
    @Test
    public void testHasNextWithNull() {
        ArrayList alist3 = new ArrayList();
        alist3.add(null);
        Iterator itr3 = alist3.iterator();

        ArrayList alist4 = new ArrayList();
        alist4.add(null);
        Iterator itr4 = alist4.iterator();

        AlternatingIterator alternatingIterator2 = new AlternatingIterator(itr3, itr4);

        assertEquals(true, alternatingIterator2.hasNext());
        assertTrue(alternatingIterator2.hasNext());
    }
    @Test
    public void testHasNextWithElements() {
        ArrayList alist5 = new ArrayList();
        alist5.add("a1");
        alist5.add("b1");
        alist5.add("c1");
        Iterator itr5 = alist5.iterator();

        ArrayList alist6 = new ArrayList();
        alist6.add("a2");
        alist6.add("b2");
        Iterator itr6 = alist6.iterator();

        AlternatingIterator alternatingIterator3 = new AlternatingIterator(itr5,itr6);

        assertEquals(true, alternatingIterator3.hasNext());
        assertTrue(alternatingIterator3.hasNext());
    }

    ArrayList alist1 = new ArrayList();
    @Test
    public void testNextWithNoElements() {
        ArrayList alist1 = new ArrayList();
        Iterator itr1 = alist1.iterator();

        ArrayList alist2 = new ArrayList();
        Iterator itr2 = alist2.iterator();

        AlternatingIterator alternatingIterator1 = new AlternatingIterator(itr1, itr2);

        try {
         alternatingIterator1.next();
         fail("NoSuchElementException");
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught " + e);
        }

    }
    @Test
    public void testNextWithNull() {
        ArrayList alist3 = new ArrayList();
        alist3.add(null);
        Iterator itr3 = alist3.iterator();

        ArrayList alist4 = new ArrayList();
        alist4.add(null);
        Iterator itr4 = alist4.iterator();

        AlternatingIterator alternatingIterator2 = new AlternatingIterator(itr3, itr4);

        assertEquals(null, alternatingIterator2.next());
        assertNull(alternatingIterator2.next());

    }
    @Test
    public void testNextWithElements() {
        ArrayList alist5 = new ArrayList();
        alist5.add("a1");
        alist5.add("b1");
        alist5.add("c1");
        Iterator itr5 = alist5.iterator();

        ArrayList alist6 = new ArrayList();
        alist6.add("a2");
        alist6.add("b2");
        Iterator itr6 = alist6.iterator();

        AlternatingIterator alternatingIterator3 = new AlternatingIterator(itr5,itr6);

        assertEquals("a1", alternatingIterator3.next());
        assertEquals("a2", alternatingIterator3.next());
        assertEquals("b1", alternatingIterator3.next());
        assertEquals("b2", alternatingIterator3.next());
        assertEquals("c1", alternatingIterator3.next());

    }

}
