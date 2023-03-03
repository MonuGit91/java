package durgasoft;

import java.util.*;
import java.lang.*;

public class TreeSetDemo3 {
    public static void main(String []arg) {
        TreeSet t = new TreeSet(new MyComparator());
        
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);

        System.out.println(t);
    }
}
class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer)obj1;
        Integer I2 = (Integer)obj2;
        //0
        if(I1 < I2) return +1;//insert element after root
        else if(I1 > I2) return -1;//insert element before root
        else return 0;//element is doplicate */
        
        /* //1
        return I1.compareTo(I2);//Ascending order [0, 5, 10, 15, 20] */
        
        /* //2
        return -I1.compareTo(I2);//Desinding order [20, 15, 10, 5, 0] */
        
        /* //3
        return I2.compareTo(I1);//Desinding order [20, 15, 10, 5, 0] */
        
         /* //4
        return -I2.compareTo(I1);//Ascending order [0, 5, 10, 15, 20] */
        
         /* //5
        return +1;//Order of inserstion [10, 0, 15, 5, 20, 20]*/
        
        /* //6
        return -1;//Reverse order of inserstion [20, 20, 5, 15, 0, 10] */
        
        /* //7
        return 0;//only one element will be inserted and remaning are considered as deplicate [10]*/
    }
}
