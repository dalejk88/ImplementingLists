import edu.greenriver.sdev333.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> friends = new ArrayList<String>();
        System.out.println("initial size is " + friends.size());

        friends.add("Jess");
        friends.add("Me");
        friends.add("Myself");
        friends.add("I");
        friends.add("Me");
        friends.add("Myself");
        friends.add("I");
        friends.add("Me");
        friends.add("I");
        friends.add("I");
        friends.add("I");
        System.out.println("size is now " + friends.size());

        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        // Shorthand for using an iterator
        for (String name : friends) {
            System.out.println(name);
        }

        // Long version
        Iterator<String> itr = friends.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}