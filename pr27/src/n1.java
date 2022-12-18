import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

public class n1 {

    public static Set<String> getInstance(Set<String> hashSet)
    {
        Set<String> treeSet = new TreeSet<String>();

        for (String i: hashSet) {
            treeSet.add(i);
        }

        return treeSet;
    }

    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<String>();
        TreeSet<String> tree = new TreeSet<String>();


        // второе значение хранимое, первое - ключ
        hs.add("four");
        hs.add("five");
        hs.add("six");

        System.out.println(hs);

        tree= (TreeSet)getInstance(hs);

        System.out.println(tree);

    }
}
