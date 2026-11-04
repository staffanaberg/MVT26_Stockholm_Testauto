package arrayListHashmap;

import java.util.ArrayList;

public class Exercise01 {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(3.1415926535);
        list.add(2.7182818284);
        list.add(1.4142135623);
        list.add(1.6180339887);
        list.add(2.3025850929);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(double number : list) {
            System.out.println(number);
        }

    }

}
