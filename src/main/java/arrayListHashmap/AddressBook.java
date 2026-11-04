package arrayListHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

        HashMap<String, Address> map = new HashMap<>();
        map.put("Staffan", new Address("Stenhuggaregatan", 41259));
        map.put("Kungen", new Address("Drottningholm", 12345));
        map.put("Zlatan", new Address("Strandvägen", 11112));
        map.put("Prince", new Address("Ringvägen", 67328));

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Address address = map.get(name);

        System.out.println(address.getStreet());
        System.out.println(address.getPostCode());


    }
}
