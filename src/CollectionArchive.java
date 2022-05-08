import java.util.*;
import java.util.Collection;

public class CollectionArchive {

    private Queue queue = new PriorityQueue();

    private List list1 = new ArrayList();
    private List list2 = new ArrayList();

    private Collection coll1 = new ArrayList();
    private Collection coll2 = new ArrayList();
    private Collection coll3 = new ArrayList();

    private Set set = new HashSet();

    private Map map = new HashMap();

    public void CollectionExample() {
        coll3.add("3 lvl");

        coll2.add("2 lvl");
        coll2.add(coll3);

        coll1.add(coll2);
        coll1.add("1 lvl");
        coll1.add(coll2);

        for (Object o : coll1) {
            System.out.println(o);
        }
    }

    public void ListExample() {
        list2.add("lvl2");
        list2.add("lvl2");
        list2.set(1, "lvl 2 - set");
        list1.add("lvl1");
        list1.add(list2);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public void QueueExample() {
        queue.add("lvl 1");
        queue.add("lvl 1(1)");
        queue.add("lvl 1(2)");
        queue.add("lvl 1(3)");
        System.out.println(queue.peek());

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(queue.poll());
            System.out.println("Collection Queue size = " + queue.size());
        }
    }

    public void SetExample() {
        set.add("one");
        set.add("two");
        set.add("three");
        for (Object o: set){
            System.out.println("# :" + o);
        }
    }

    public void MapExample() {
        queue.add("lvl 2");
        list2.add("lvl 1");
        list2.add(queue);
        map.put(1, "step #1");
        map.put(2, "step #1");
        map.put(3, "step #1");
        map.put(4, list2);

        Set entrySet = map.entrySet();
        for (Object o : entrySet){
            System.out.println(o);
        }

        Set keySet = map.keySet();
        for (Object o : keySet){
            System.out.println(o);
            System.out.println(map.get(o));
        }
    }


}
