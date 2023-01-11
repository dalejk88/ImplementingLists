import edu.greenriver.sdev333.*;
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
        friends.add("I");
        friends.add("I");
        friends.add("I");
        friends.add("I");
        System.out.println("size is now " + friends.size());
    }
}