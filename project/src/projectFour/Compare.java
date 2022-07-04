package projectFour;

import java.util.ArrayList;
import java.util.LinkedList;

public class Compare {
    public static void compareToList(){
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int x = 1000000;
        final int y = 1000;
        for (int i = 0; i < x; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());

            
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < y; i++) {
            arrayList.get((int) (Math.random()*(x-1)));


        }
System.out.println(System.currentTimeMillis()-start);
        start = System.currentTimeMillis();
        for (int i = 0; i < y; i++) {

            linkedList.get((int) Math.random()*(x-1));

            
        }
        System.out.println(System.currentTimeMillis()-start);

    }

    public static void main(String[] args) {
        compareToList();
    }
}
