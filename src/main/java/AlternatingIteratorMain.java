import java.util.ArrayList;
import java.util.Iterator;

public class AlternatingIteratorMain {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add("a");
        al1.add("b");
        al1.add("c");
        Iterator itr1 = al1.iterator();

        ArrayList al2 = new ArrayList();
        al2.add("1");
        al2.add("2");
        Iterator itr2 = al2.iterator();

        ArrayList al3 = new ArrayList();
        al3.add("x");
        al3.add("y");
        al3.add("z");
        Iterator itr3 = al3.iterator();

        AlternatingIterator altItr = new AlternatingIterator(itr1,itr2,itr3);

        altItr.forEachRemaining(itr -> {
            System.out.println(itr);
         });


    }
}
