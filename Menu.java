import java.util.Scanner;

public class Menu {
    /**
     * Menu class is responsible for greeting the user, showing a menu
     * to the user for interaction with the application.
     * The class maintains a String[] array of menu options, which it
     * uses for printing the menu to standard out.
     * The class is also responsible for responding to user interaction
     * with respect to its menu.
     */
    private String[] menuOptions = {};
    private Scanner in;

    /**
     * Class constructor, which expects a Scanner object
     * It allows for the user to specify how a Scanner is to
     * be configured outside this class and for basic inversion of control.
     * 
     * @param scanner takes in a Scanner object to initialize
     * @return
     */
    public Menu(Scanner in) {
        this.in = in;
    }

    /**
     * Prints the menu to standard output, using the class's menuOptions array.
     * It accepts user input using the encapsulated Scanner instance.
     * All output is printed to standard out.
     * All input is collected from standard in.
     */
    public void executeMenu() {
        printMenu();
        exit();
    }

    /**
     * Asks the user to enter their name.
     * After the user provides their name, it outputs a greeting to the user to
     * standard out.
     */
    public void greet() {
        String name = in.nextLine();
        System.out.println("What is your name?");

        System.out.println("Welcome " + name + "to T-Shirt Mart!");
    }

    /**
     * Prints the menu header and menu options.
     */
    public void printMenu() {
        System.out.println();
        System.out.println("--Main Menu--");
        System.out.println("Select an option using one of the numbers shown");
        System.out.println();

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println(i + ": ");
            System.out.println(menuOptions[i]);
        }

    }

    /**
     * Prints an exit statement and closes the scanner object.
     */
    public void exit() {
        System.out.println("Goodbye!");
        in.close();
    }

    /**
     * Collects next user-entered int.
     * 
     * @return integer value denoting the user selection
     */
    public int getNextIntFromUser() {
        return in.nextInt();
    }

    /**
     * Skips a line of empty input from the scanner's input stream
     * and then returns the next available line.
     * 
     * @return string representing the line of input typed by the user
     */
    public String getNextStringLineFromUser() {
        in.nextLine();
        return in.nextLine();

    }
}
