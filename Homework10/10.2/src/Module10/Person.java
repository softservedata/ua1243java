package Module10;

import java.util.*;

public class Person {
    public void run(Map<String,String> personMap) {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(4);
            switch (option) {
                case 1 -> showPerson(personMap);
                case 2 ->looking(personMap);
                case 3 -> removeStudent(personMap);
                case 4 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }

    private void showPerson(Map<String,String> personMap) {
        for (var entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    private int readOption ( int nOptions){
        System.out.println("Enter option from 1 to " + nOptions + ":");
        var scan = new Scanner(System.in);
        return  Integer.parseInt(scan.nextLine());
    }

    private void showMainMenu () {
        System.out.println("=".repeat(60));
        System.out.println("""
                    Main menu:
                    1. Show persons
                    2. Find  person
                    3. Remove person
                    4. Exit
                    """
        );
        System.out.println("=".repeat(60));
    }
    public  void looking(Map<String,String> personMap) {
        System.out.println("Hello! I am looking for a some person, can you help me ?");
        var scan = new Scanner(System.in);
        System.out.println("=".repeat(60));
        System.out.println("Hello! Yes, sure. Please,enter the  name of person: ");
        String firstName = scan.nextLine();
        System.out.println("=".repeat(60));

        Set<Map.Entry<String, String>> set = personMap.entrySet();
        boolean temp = false;
        System.out.println("Here is what I found:");
        for (Map.Entry<String,String> me : set) {
            if (Objects.equals(me.getValue(), firstName)) {
                System.out.println(me.getKey() + " : " + me.getValue());
                temp = true;
            }
        }
        if (!temp){
            System.out.println("Sorry,but we have not such a person.");
        }
    }
    private void removeStudent(Map<String,String> personMap) {
        System.out.println("Hello! Enter the name of person, which I have to delete: ?");
        var scan = new Scanner(System.in);
        System.out.println("=".repeat(60));
        String firstName = scan.nextLine();
        System.out.println("=".repeat(60));
        Iterator<Map.Entry<String,String>> i = personMap.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String,String> entry = i.next();
            if(entry.getValue().equals(firstName)) {
                System.out.println("Removing entry " + entry);
                i.remove();
            }
        }
        System.out.println(personMap);
    }
}






