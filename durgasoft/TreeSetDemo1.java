import java.util.*;
public class TreeSetDemo1 {
    public static void main(String []arg) {
        TreeSet t = new TreeSet();

        t.add(new StringBuffer("A"));//ClassCastException
        t.add(new StringBuffer("Z"));//ClassCastException
        System.out.println(t);
    }
}
