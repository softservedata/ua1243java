package Module11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManagementSystem {

    private final Map<Integer, User> users = new HashMap<>();

    public  UserManagementSystem() {
       addUser( new User(
               1,
               "Khrystyna",
               "Martynova"
       ));
       addUser( new User(
               2,
               "Oleksandr",
                "Martynov"

                ));
    }
    private void addUser(User user) {
        users.put(user.id(), user);
    }
    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(3);
            switch (option) {

                case 1 -> {
                    var user = promtNewUser();
                    addUser(user);
                }
                case 2 -> showUser();

                case 3-> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }
    private int readId(){
        var scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the id: ");
            int id = Integer.parseInt(scan.nextLine());
            if (users.containsKey(id)) {
                System.out.println("Such id is already occupied, choose another one");
                continue;
            }
            return  id;
        }
    }
    private String inputName(){
        var scan = new Scanner(System.in);
        Pattern p = Pattern.compile("[A-zA-Z\\s-]+$");
        while(true) {
            System.out.println("Enter the first name for the new user: ");
            String firstName = scan.nextLine().trim();
            Matcher m = p.matcher(firstName);
            if (m.matches()) {
                System.out.println("Ok");
            } else {
                System.out.println("Invalid input! Please try again! The input data should contains  only English letters, which can contains spaces and hyphens");
            continue;
            }
            return firstName;
        }

    }
    private String inputLastName(){
        var scan = new Scanner(System.in);
        Pattern p = Pattern.compile("[A-zA-Z\\s-]+$");
       while (true){
        System.out.println("Enter the last name for the new user: ");
        String lastName = scan.nextLine().trim();
        Matcher m2 = p.matcher(lastName);
        if(m2.matches()){
            System.out.println("Ok");

        }else {
            System.out.println("Invalid input! Try again! The input data should contains only English letters, which can contains spaces and hyphens");
        continue;
        }
        return lastName;
       }
    }

    private User promtNewUser() {
        System.out.println("Let's add new user!");
        int id = readId();
        String firstName = inputName();
        String lastName = inputLastName();
         return new User(
                 id,
               firstName,
                 lastName

        );
    }
    private void showUser () {
        if (users.isEmpty()) {
            System.out.println("There are no users yet.");
        } else {
            for (var entry : users.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        }
    }
    private int readOption ( int nOptions){
        System.out.println("Enter option from 1 to " + nOptions + ":");
        var scan = new Scanner(System.in);
        return  Integer.parseInt(scan.nextLine());
    }
    private void showMainMenu () {
        System.out.println("""
                    Main menu:
                    1. Add new student
                    2. Show the users
                    3. Exit
                   
                    """
        );
    }
}
