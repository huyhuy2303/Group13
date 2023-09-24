package PortManagement;

import java.util.Scanner;

// Class
public class PortRecordLinkedList {

    // Main driver method
    public static void main(String[] args) {

        // Creating HumanResourceOffice Object.
        PortRecordManagement hr = new PortRecordManagement();

        Port port = new Port();

        // Initial Employee record
        // Using mutators to had code the data
        port.setId("P001");
        port.setLatitude(10.0);
        port.setLongitude(10.0);
        port.setLandingAbility(true);
        port.setName("Port A");

        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        hr.add(port);

        // Creating Scanner Object to read input
        Scanner input = new Scanner(System.in);

        // Creating option integer variable
        int option = 0;

        // Do - While loop
        do {
            menu();
            option = input.nextInt();

            // Switch case
            switch (option) {

                // Case 1
                case 1:

                    // Display message
                    System.out.print(
                            "What is the Student id Number ? ");

                    String Id = input.nextLine();
                    System.out.print(
                            "What is the Student id Number ? ");

                    double latitude = input.nextDouble();

                    System.out.print(
                            "What is the Student id Number ? ");

                    double longitude = input.nextDouble();

                    System.out.print(
                            "What is the Student id Number ? ");

                    int totalCapacity = input.nextInt();

                    System.out.print(
                            "What is the Student id Number ? ");

                    boolean landingAbility = input.nextBoolean();

                    // Display message
                    System.out.print(
                            "What is the Student Name ? ");

                    String name = input.nextLine();
                    port = new Port(Id, name, latitude, longitude, totalCapacity, landingAbility);
                    // Call add() record
                    hr.add(port);
                    System.out.println(port);
                    break;

                // Case 2
                case 2:

                    // Display message
                    System.out.print(
                            "What is the Student id number ? ");
                    int rId = input.nextInt();

                    // Invoke remove/delete record
                    hr.delete(rId);

                    break;

                // Case 3
                case 3:

                    // Display message
                    System.out.print(
                            "What is the Student id number? ");

                    int rIdNo = input.nextInt();
                    hr.update(String.valueOf(rIdNo), input);

                    break;

                // Case 4

                // Case 5
                case 5:
                    hr.display();
                    break;

                // Case 6
                case 9:

                    // Display message
                    System.out.println(
                            "\nThank you for using the program. Goodbye!\n");
                    System.exit(0);

                    break;

                // Case 7: Default case
                // If none above case executes
                default:

                    // Print statement
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }

        // Checking condition
        while (option != 9);
    }

    // Method 2
    // Menu - Static menu for displaying options
    public static void menu() {

        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
