import java.util.*;

/**
 * Sandbox code to showcase the set portion of collections
 * Created by MattinAction on 9/30/16.
 */
public class Set {
    public static void runSet(){
        // Happy Path: Builds a hashset and loads class memebers into the set
        // Result: The strings are loaded into the set and then prints out the set
        String names[] = {"Matt", "Matt Prime", "Tanner", "Karlee", "Jordan", "Asher", "Travis", "Heather", "Trek"};
        HashSet<String> set = new HashSet<>();

        try{
            int size = names.length;

            for (int i = 0; i < size; i++) {
                set.add(names[i]);
            }

            System.out.println("This is the hashset:");
            System.out.println(set + "\n");

            // Happy Path: hashSet -> treeSet
            // Result: Moving the hashSet over to treeSet causes the list to become ordered
            TreeSet<String> hiTreeSet = new TreeSet<>(set);

            System.out.println("Here we have a sorted TreeSet: ");
            System.out.println(hiTreeSet + "\n");

            // Happy Path: add() to hashSet
            // Result: Harvey Dent is added to the hashSet in no particular order
            set.add("Harvey Dent");
            System.out.println("With Harvey Dent added in:");
            System.out.println(set + "\n");

            // Happy Path: add() to treeSet
            // Result: Harvey Dent is added to the hashSet and the set is resorted
            hiTreeSet.add("Harvey Dent");
            System.out.println("TreeSet w/ Harvey Dent");
            System.out.println(hiTreeSet + "\n");

            // Happy Path: clear(), isEmpty()
            // Result: hiTreeSet is emptied out and then isEmpty() responds saying the set is empty
            //hiTreeSet.clear();

            System.out.println(hiTreeSet);

            boolean testing = hiTreeSet.isEmpty();
            System.out.println("Is hiTreeSet empty: " + testing + "\n");

            // Happy Path: size()
            // Result: The sizes of both sets is stored in the variables
            int hashSize = set.size();
            int treeSize = hiTreeSet.size();

            System.out.println("Set sizes:");
            System.out.println("hashSet: " + hashSize);
            System.out.println("treeSet: " + treeSize + "\n");

            // Happy Path: remove()
            // Result: Harvey dent is removed from the hashSet
            set.remove("Harvey Dent");
            System.out.println("W/O Harvey Dent");
            System.out.println(set + "\n");

            // Nasty Path: empty String provided for add()
            // Result: The empty string is added to the set
            set.add("");
            System.out.println("W/ Empty String");
            System.out.println(set + "\n");

            // Nasty Path: searching for the empty String
            // Result: The empty string was located in the set
            testing = set.contains("");
            System.out.println("The string was found: " + testing + "\n");

            // Nasty Path: add() nextline string command
            // Result: The element was added, but it causes the displayed result to act as if in println
            set.add("\n");
            System.out.println("W/ nextLine command");
            System.out.println(set + "\n");
            set.remove("\n");

            // Nasty Path: add() null
            // Result: Null added to the set CASTING?
            set.add(null);
            System.out.println("W/ null");
            System.out.println(set + "\n");

            // Nasty Path: adding a duplicate element
            // Result: The duplicate element was replaced
            set.add("Matt");
            System.out.println("Duplicate: ");
            System.out.println(set + "\n");

            // Nasty Path: giving TreeSet null to see where it's located
            // Result:
            hiTreeSet.add(null);
            System.out.println("Duplicate: ");
            System.out.println(set + "\n");
        }

        catch(Exception e){
            System.out.println("An error occurred, please try something else");
        }
    }
}
