/**
 * Created by HaMi on 2017-09-29.
 * This program takes in a string as input, removed the duplicates and then prints out the results
 * Using a LinkedHashSet instead of a HashSet since it maintains the insertion order
 * LinkedHashSet implements the Set interface which ensures that there will be no two identical elements
 * Since we only iterate through the string once, this program will have the time complexity of O(n)
 */

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String a = "abra";
        String b = "kadabra";
        String c = "alakazam";
        RemoveDuplicate r = new RemoveDuplicate();
        r.removeDupe(a);
        r.removeDupe(b);
        r.removeDupe(c);
    }

    private void removeDupe(String s) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            lhs.add(s.charAt(i));
        }
        for (Character ch : lhs) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
