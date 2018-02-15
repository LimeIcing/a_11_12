import java.util.HashSet;
import java.util.LinkedList;

public class Main12 {

    /*
    Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs
    at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.
     */

    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Nakmor");
        a.add("Ryder");
        a.add("Harper");
        a.add("Nyx");
        a.add("Ryder");
        a.add("Kosta");
        System.out.println(contains3(a));
        a.add("Ryder");
        System.out.println(contains3(a));
        a.add("Ryder");
        System.out.println(contains3(a));
    }

    public static boolean contains3(LinkedList<String> list) {
        HashSet<String> aux = new HashSet<>(list);

        for (String setStr:aux) {
            int counter = 0;
            for (String listStr:list) {
                if (setStr.equals(listStr)) {
                    counter++;
                    if (counter == 3) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
