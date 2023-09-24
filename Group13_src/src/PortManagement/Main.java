package PortManagement;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    PortManagementSystem PortManagementSystem = new PortManagementSystem();

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayWelcomeScreen();
            displayMainMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    loginUser();
                    break;
                case 2:
                    System.out.println("Functionality not yet implemented.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void displayWelcomeScreen() {
        System.out.println("COSC2081 GROUP ASSIGNMENT");
        System.out.println("CONTAINER PORT MANAGEMENT SYSTEM");
        System.out.println("Instructor: Mr. Minh Vu & Dr. Phong Ngo");
        System.out.println("Group: 13");
        System.out.println("s3975039, Le Xuan Duc");
        System.out.println("s3979815, Tran Trong Huy");
        System.out.println("s3916278, Nguyen Quoc Khanh");
        System.out.println("=========================================");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    private static void displayMainMenu() {
        System.out.println("=== Container Port Management System ===");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("Enter your choice(number): ");
    }

    private static void loginUser() {
        System.out.println("=== User Login ===");

        System.out.println("1. Login as System Admin");
        System.out.println("2. Login as Port Manager");
        System.out.print("Enter your choice(number): ");

        int roleChoice;
        try {
            roleChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        // Note: For demonstration purposes only. Not a secure way to read passwords.
        String password = scanner.nextLine();
        String user = null;

        // Hypothetical authentication logic.
        // In a real-world scenario, you'd validate the username and password against a database or data files.
        if (username.equals("admin") && password.equals("admin123") && roleChoice == 1) {
            user="admin";
             // Directly call the admin dashboard upon successful login as admin
        } else if (username.equals("manager") && password.equals("manager123") && roleChoice == 2) {
            user="manager"; // Directly call the manager dashboard upon successful login as manager
        } else {
            System.out.println("Invalid credentials or role choice. Please try again.");
            loginUser();
        }
        chooseChoices(user);
    }
    private static void adminDashboard() {
        System.out.println("Welcome Admin! You can manage everything here.");

        while (true) {
            System.out.println("\n=== Admin Dashboard ===");
            System.out.println("1. View Ports");
            System.out.println("2. View Containers");
            System.out.println("3. View Vehicles");
            System.out.println("4. View Trip");
            System.out.println("5. Log Out");


            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:

                    int option = scanner.nextInt();
                    System.out.println("1. Add Port");
                    System.out.println("2. Remove Port");
                    System.out.println("3. Modify Port");
                    System.out.println("4. Calculate The Distance");

                    switch (option) {
                        case 1:
//                                Main m = new Main();
//                                List<Port> list = m.Port.readPorts();
//
//                                for (Port Port : list) {
//                                    System.out.println(Port);
//                                }

                            break;
                        case 2:
//                                removePort();
                            break;
                        case 3:
//                                modifyPorts();
                            break;
                        case 4:
//                                calculateDistance();
                            break;
                        case 5:
                            return;
                        default:
                            System.out.println("Invalid Option!");
                    }

                case 2:

                    int option2 = scanner.nextInt();

                    System.out.println("1. Add Container");
                    System.out.println("2. Remove Container");
                    System.out.println("3. Modify Container");
                    System.out.println("4. Load Container");
                    System.out.println("5. Unload Container");
                    System.out.println("6. Calculate Weight Of Each Type");

                    switch (option2) {
                        case 1:
//                                Main m = new Main();
//                                List<Port> list = m.Port.readPorts();
//
//                                for (Port Port : list) {
//                                    System.out.println(Port);
//                                }

                            break;
                        case 2:
//                                removeContainer();
                            break;
                        case 3:
//                                modifyContainers();
                            break;
                        case 4:
//                                loadContainer();
                            break;
                        case 5:
//                                UnloadContainer();
                            break;
                        case 6:
//                                CalculateWeight();
                            break;
                        case 7:
                            return;
                        default:
                            System.out.println("Invalid Option!");
                    }

                case 3:

                    int option3 = scanner.nextInt();

                    System.out.println("1. Add Vehicle");
                    System.out.println("2. Remove Vehicle");
                    System.out.println("3. Modify Vehicle");

                    switch (option3) {
                        case 1:
//                                Main m = new Main();
//                                List<Port> list = m.Port.readPorts();
//
//                                for (Port Port : list) {
//                                    System.out.println(Port);
//                                }

                            break;
                        case 2:
//                                removeVehicle();
                            break;
                        case 3:
//                                modifyVehicles();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Invalid Option!");
                    }

                case 4:

                    int option4 = scanner.nextInt();

                    System.out.println("1. Start Trip");
                    System.out.println("2. End Trip");
                    switch (option4){
                        case 1:
//                                StartTrip();
                            break;
                        case 2:
//                                EndTrip();
                            break;
                        case 3:
                            return;
                    }


                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    private static void managerDashboard() {
        System.out.println("Welcome Manager! You can manage Ports, Containers, and Vehicles.");

        while (true) {
            System.out.println("\n=== Manager Dashboard ===");
            System.out.println("1. View Ports");
            System.out.println("2. View Containers");
            System.out.println("3. View Vehicles");
            System.out.println("4. Search Trip");
            System.out.println("5. Log Out");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Scanner scanner5 = new Scanner(System.in);
                    int option = scanner5.nextInt();

                    System.out.println("1. Add Port");
                    System.out.println("2. Remove Port");
                    System.out.println("3. Modify Port");
                    System.out.println("4. Calculate The Distance");

                    switch (option) {
                        case 1:
                            Main m = new Main();
                            List<Port> list = m.PortManagementSystem.readPorts();

                            for (Port Port : list) {
                                System.out.println(Port);
                            }

                            break;
                        case 2:
//                                removePort();
                            break;
                        case 3:
//                                modifyPorts();
                            break;
                        case 4:
//                                calculateDistance();
                            break;
                        case 5:
                            return;
                        default:
                            System.out.println("Invalid Option!");
                    }

                case 2:
                    int option2 = scanner.nextInt();

                    System.out.println("1. Add Container");
                    System.out.println("2. Remove Container");
                    System.out.println("3. Modify Container");
                    System.out.println("4. Load Container");
                    System.out.println("5. Unload Container");
                    System.out.println("6. Calculate Weight Of Each Type");

                    switch (option2) {
                        case 1:

                            break;
                        case 2:
//                                removeContainer();
                            break;
                        case 3:
//                                modifyContainers();
                            break;
                        case 4:
//                                loadContainer();
                            break;
                        case 5:
//                                UnloadContainer();
                            break;
                        case 6:
//                                CalculateWeight();
                            break;
                        case 7:
                            return;
                        default:
                            System.out.println("Invalid Option!");
                    }

                case 3:
                    int option3 = scanner.nextInt();
                    while (true){
                        System.out.println("1. Add Vehicle");
                        System.out.println("2. Remove Vehicle");
                        System.out.println("3. Modify Vehicle");

                        switch (option3) {
                            case 1:
                                Main m = new Main();
                                List<Port> list = m.PortManagementSystem.readPorts();

                                for (Port Port : list) {
                                    System.out.println(Port);
                                }

                                break;
                            case 2:
//                                removeVehicle();
                                break;
                            case 3:
//                                modifyVehicles();
                                break;
                            case 4:
                                int option4 = scanner.nextInt();

                                System.out.println("1. Start Trip");
                                System.out.println("2. End Trip");
                                switch (option4){
                                    case 1:
//                                StartTrip();
                                        break;
                                    case 2:
//                                EndTrip();
                                        break;
                                    case 3:
                                        return;
                                }


                            case 5:
                                System.out.println("Logging out...");
                                return;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
            }
        }
    }


    private static void chooseChoices(String user) {
        System.out.println("=== Choose Choices ===");
        System.out.println("1. Modify the data");
        System.out.println("2. Function");
        System.out.println("Enter your choice(number): ");

        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        if (choice == 1) {
            modifyOption(user);
        } else if (choice==2) {
            functionOption(user);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            chooseChoices(user);
        }
    }

    private static void modifyOption(String user) {
        System.out.println("=== Modify Option ===");

        if (user.equals("manager")) {
            System.out.println("1. Container");
            System.out.println("2. Trip");
        } else if (user.equals("admin")) {
            System.out.println("1. Container");
            System.out.println("2. Trip");
            System.out.println("3. Port");
            System.out.println("4. Vehicle");
        }

        System.out.println("Enter your choice(number): ");

        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        if (choice == 1) {
            ContainerModificationData();
        } else if (choice==2) {
            TripModificationData();
        } else if (choice==3) {
            PortModificationData();
        } else if (choice==4) {
            VehicleModificationData();
        } else {
            System.out.println("Invalid choice.");
            chooseChoices(user);
        }
    }

    private static void ContainerModificationData() {
        System.out.println("=== Container Modification data ===");
        System.out.println("1. Add container");
        System.out.println("2. Remove container");
        System.out.println("3. Modify existing data");
        System.out.print("Enter your choice(number): ");

        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }

    }

    private static void TripModificationData() {
        System.out.println("=== Trip Modification data ===");
        System.out.println("1. Start trip");
        System.out.println("2. End trip");
        System.out.print("Enter your choice(number): ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }

    private static void PortModificationData() {
        System.out.println("=== Port Modification data ===");
        System.out.println("1. Add port");
        System.out.println("2. Remove port");
        System.out.println("3. Modify existing data");
        System.out.print("Enter your choice(number): ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }

    private static void VehicleModificationData() {
        System.out.println("=== Vehicle Modification data ===");
        System.out.println("1. Add vehicle");
        System.out.println("2. Remove vehicle");
        System.out.println("3. Modify existing data");
        System.out.print("Enter your choice(number): ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }

    public static void functionOption(String user){
        System.out.println("=== Function Option ===");
        System.out.println("1. Container");
        System.out.println("2. Port");
        System.out.println("3. Trip");
        System.out.println("4. Vehicle");
        System.out.print("Enter your choice(number): ");

        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        if (choice == 1) {
            ContainerFunctionData();
        } else if (choice==2) {
            TripFunctionData();
        } else if (choice==3) {
            PortFunctionData();
        } else if (choice==4) {
            VehicleFunctionData();
        } else {
            System.out.println("Invalid choice.");
            chooseChoices(user);
        }
    }

    private static void ContainerFunctionData() {
        System.out.println("=== Container Function ===");
        System.out.println("1. Load container");
        System.out.println("2. Unload container");
        System.out.println("3. Calculate weight of each type");
        System.out.print("Enter your choice(number): ");

        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }

    }

    private static void TripFunctionData() {
        System.out.println("=== Trip Function ===");
        System.out.println("1. Start trip");
        System.out.println("2. End trip");
        System.out.println("2. Search trip");
        System.out.print("Enter your choice(number): ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }

    private static void PortFunctionData() {
        System.out.println("=== Port Function ===");
        System.out.println("1. Calculate distance");
        System.out.print("Enter your choice(number): ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }

    private static void VehicleFunctionData() {
        System.out.println("=== Vehicle Function ===");
        System.out.println("1. Move Port");
        System.out.println("2. Load container");
        System.out.println("3. Unload container");
        System.out.println("4. Refuel");
        System.out.print("Enter your choice(number): ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
            return; // Return to the main menu
        }

        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }
}



