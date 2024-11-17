package CollectionFramework;

import java.util.*;

public class Collections {
/*
       A collection it is a simply an object that represent a group of related objects

        A queue is a collection designed for holding elements
        prior to processing. In other words, the processing order matters, so
        the first and last positions, or the head and tailare prioritized

        a set is collection conceptually off a mathematical set
        it contains no duplicate elements and isn't naturally ordered

        a map is a set,and the values are a seprate collection, where the key keeps a reference to a
        value. key need to be unique, but value doesn't


 */
    public static void main(String[] args) {

        //List<String> list = new ArrayList<String>();
//        Collection<String> list = new TreeSet<>();
        Collection<String> list = new HashSet<>();

        String[] names={"Shubham","Pushpam","Anuj", "Anil"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Sambhu");
        list.addAll(Arrays.asList("Raju","Sharma","Ravi","Mohit"));
        System.out.println(list);
        System.out.println("Anil is in the list?"+ list.contains("Anil"));

        list.removeIf(s->s.charAt(0)=='A');
        System.out.println("Anil is in the list?"+ list.contains("Anil"));
        System.out.println(list);


    }






}
