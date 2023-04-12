import java.util.Scanner;

public class Menu {
    
    // Private members for the menu 
    private Scanner scanner;
    private Cart cart; // Need to built
    private Shop shop; // Need to build

    // This method greets the customers and asks for a name. 
    public void greet() {
        System.out.println("Welcome to PLACEHOLDER name! what's your name?");
        String customerName = getNextLineFromUser();
        System.out.println("Welcome to PLACEHOLDER name! %s", customerName);
        executeMenu();
    }

    // This method execute the menu functions : print menu , user selection
    public static void executeMenu() {
        // Print the menu options using the printMenu method 
        // Use handleShopperMenuOptionSelection for the choices
    }

    // This method prints the menu
    private void printMenu() {
        // Print out all the menu options
    }

    // Method for handling menu selection made by the user
    private void handleShopperMenuOptionSelection(MenuOption option) {
        // Have to built ENUM in the MenuOption class    
    }

    // This method get the option selected by the user. Need to work on ENUM MenuOption class first
    private MenuOption getNextOptionFromUser() {
        
    }

    // This method finds the product the user is looking for, we look in the array list of products located in the Products class
    private void findProduct() {
        // Need to work on Products class so we can build this search function
    }

    // This method adds things to the cart
    private void addToCart() {
        // Need to build out Cart class
    }

    // This method gets the next int entered by the user
    private int getNextIntFromUser() {
        return scanner.nextInt;
    }

    // This method gets the next line entered by the user
    private String void getNextStringLineFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    }

    // This method exits the program when the exit menu option is selected
    private void exit() {
        System.out.println("Goodbye.");
        exit();
    }
}   