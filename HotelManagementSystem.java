import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class HotelManagementSystem {

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Map to store admin login credentials
    private static final Map<String, String> adminLoginCredentials = new HashMap<>();

    // Map to store receptionist login credentials
    private static final Map<String, String> receptionistLoginCredentials = new HashMap<>();

    // private static final String[] hotelCheckInData = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reservation> list = new ArrayList<Reservation>();

        clearScreen();

        // Initialize admin login credentials
        adminLoginCredentials.put("admin", "password");

        while (true) {
            System.out.println("Welcome to the Hotel Management System!");
            System.out.println("1. Admin Login");
            System.out.println("2. Receptionist Login");
            System.out.println("3. Add New Admin");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Admin Username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter Admin Password: ");
                    String adminPassword = scanner.nextLine();

                    if (adminLoginCredentials.containsKey(adminUsername)
                            && adminLoginCredentials.get(adminUsername).equals(adminPassword)) {
                        // Admin logged in successfully
                        clearScreen();
                        System.out.println("Admin Login Successful!");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

                        while (true) {
                            System.out.println("1. Add New Receptionist");
                            System.out.println("2. Show All Registered Receptionists");
                            System.out.println("3. Logout");

                            int adminChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (adminChoice) {
                                case 1:
                                    System.out.print("Enter New Receptionist Username: ");
                                    String newReceptionistUsername = scanner.nextLine();
                                    System.out.print("Enter New Receptionist Password: ");
                                    String newReceptionistPassword = scanner.nextLine();

                                    // Check if new receptionist already exists
                                    if (receptionistLoginCredentials.containsKey(newReceptionistUsername)) {
                                        System.out.println("Receptionist Username Already Exists!");
                                        System.out.println("");
                                        System.out.println("");

                                    } else {
                                        // Add new receptionist to the map
                                        receptionistLoginCredentials.put(newReceptionistUsername,
                                                newReceptionistPassword);
                                        clearScreen();
                                        System.out.println("New Receptionist Added Successfully!");
                                        System.out.println("");
                                        System.out.println("");
                                    }

                                    break;

                                case 2:
                                    // Show all registered receptionists
                                    clearScreen();
                                    System.out.println("Registered Receptionists:");
                                    System.out.println("");

                                    for (String username : receptionistLoginCredentials.keySet()) {
                                        System.out.println("=====" + username + "=====");
                                        System.out.println("");
                                    }

                                    break;

                                case 3:
                                    clearScreen();
                                    System.out.println("Admin Logged Out Successfully.");
                                    System.out.println("");
                                    System.out.println("");

                                    break;

                                default:
                                    System.out.println("Invalid Choice. Please Try Again.");
                                    System.out.println("");
                                    System.out.println("");
                                    break;
                            }

                            if (adminChoice == 3) {
                                break;
                            }
                        }

                    } else {
                        clearScreen();
                        System.out.println("Invalid Admin Username or Password!");

                    }

                    break;

                case 2:
                    System.out.print("Enter Receptionist Username: ");
                    String receptionistUsername = scanner.nextLine();
                    System.out.print("Enter Receptionist Password: ");
                    String receptionistPassword = scanner.nextLine();

                    if (receptionistLoginCredentials.containsKey(receptionistUsername)
                            && receptionistLoginCredentials.get(receptionistUsername).equals(receptionistPassword)) {
                        // Receptionist logged in successfully
                        clearScreen();
                        System.out.println("");
                        System.out.println("");

                        System.out.println("Receptionist Login Successful!");
                        System.out.println("");
                        System.out.println("");

                        while (true) {
                            System.out.println("1. Check-In Customer");
                            System.out.println("2. View Customer Details");
                            System.out.println("3. Check-Out Customer");
                            System.out.println("4. Logout");

                            int receptionistChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (receptionistChoice) {

                                case 1:

                                    System.out.print("Enter Customer Name: ");
                                    String Name = scanner.nextLine();

                                    System.out.print("Enter Customer Mobile Number: ");
                                    String MobileNumber = scanner.nextLine();

                                    System.out.print("Enter Customer ID: ");
                                    String Id = scanner.nextLine();

                                    System.out.print("Enter Customer Gender: ");
                                    String Gender = scanner.nextLine();

                                    System.out.print("Enter Check-In Date: ");
                                    String checkInDate = scanner.nextLine();

                                    System.out.print("Enter Room Type: ");
                                    String roomType = scanner.nextLine();

                                    System.out.print("Enter Room Number: ");
                                    String roomNumber = scanner.nextLine();

                                    System.out.print("Enter Price: ");
                                    String price = scanner.nextLine();

                                    scanner.nextLine();

                                    System.out.print("Enter Address: ");
                                    String address = scanner.nextLine();

                                    // create a new Reservation object with the user's input and add it to the
                                    // ArrayList
                                    Reservation reservation = new Reservation(Name, MobileNumber, Id, Gender,
                                            checkInDate, roomType, roomNumber, price, address);
                                    list.add(reservation);

                                    clearScreen();
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Data Successfully Entered");
                                    // in case 1, read the input data and add to arrays

                                    System.out.println("");

                                    System.out.println("Customer Checked-In Successfully!");
                                    System.out.println("");
                                    System.out.println("");

                                    break;

                                case 2: {
                                    clearScreen();
                                    System.out.println("Customer Details:");
                                    System.out.println("");
                                    //display the details of all the Reservations in the ArrayList
                                    for (int i = 0; i < list.size(); i++) {
                                    Reservation r = list.get(i);
                                    System.out.println("======CUSTOMER" + (i + 1) + "=====");
                                    System.out.println("");
                                    System.out.println("Name: " + reservation.getName());
                                    System.out.println("Mobile Number: " + reservation.getMobileNumber());
                                    System.out.println("ID: " + reservation.getId());
                                    System.out.println("Gender: " + reservation.getGender());
                                    System.out.println("Check-in Date: " + reservation.getCheckInDate());
                                    System.out.println("Room Type: " + reservation.getRoomType());
                                    System.out.println("Room Number: " + reservation.getRoomNumber());
                                    System.out.println("Price: " + reservation.getPrice());
                                    System.out.println("Address: " + reservation.getAddress());
                                    System.out.println();
                                    }
                                    //displaying the list line by line using get

                                    // for (int i = 0; i < list.size(); i++) {
                                    //     System.out.println("======CUSTOMER" + (i + 1) + "=====");
                                    //     System.out.println("");
                                    //     System.out.println("Name: " + reservation.Name(i));
                                    //     System.out.println("Mobile Number: " + reservation.MobileNumber(i));
                                    //     System.out.println("ID: " + reservation.Id(i));
                                    //     System.out.println("Gender: " + reservation.Gender(i));
                                    //     System.out.println("Check-in Date: " + reservation.checkInDate(i));
                                    //     System.out.println("Room Type: " + reservation.roomType(i));
                                    //     System.out.println("Room Number: " + reservation.roomNumber(i));
                                    //     System.out.println("Price: " + reservation.Price(i));
                                    //     System.out.println("Address: " + reservation.address(i));

                                    // }

                                    System.out.println("");
                                    System.out.println("");
                                    // displaying specific elements of the list line by line

                                    break;
                                }

                                case 3:
                                    // in case 3, display the data

                                    System.out.print("Enter Room Number: ");
                                    int checkOutRoomNumber = scanner.nextInt();

                                    // Do something with check-out data

                                    System.out.println("Customer Checked-Out Successfully!");
                                    break;

                                case 4:
                                    clearScreen();
                                    // prompt the user to enter the details of the Reservation to be checked out and
                                    // deleted
                                    System.out.print(
                                            "Enter Name, ID, or Room Number of the Customer to check out and delete: ");
                                    String query = scanner.nextLine();

                                    // find the Reservation to check out and delete based on the user's input
                                    Reservation reservationToDelete = null;
                                    for (Reservation r : list) {
                                        if (r.getName().equals(query) || r.getId().equals(query)
                                                || r.getRoomNumber() == Integer.parseInt(query)) {
                                            reservationToDelete = r;
                                            break;
                                        }
                                    }

                                    // if the Reservation was found, calculate the price and remove it from the list
                                    if (reservationToDelete != null) {
                                        // prompt the user to enter the check-out date
                                        System.out.print("Number of Days stayed : ");
                                        double daysStayed = scanner.nextLine();

                                        // calculate the number of days the customer stayed and the total price
                                    
                                              
                                        double totalPrice = daysStayed * reservationToDelete.getPrice();

                                        System.out.println("Total Price: " + totalPrice);

                                        list.remove(reservationToDelete);
                                        System.out.println("Customer checked out and deleted successfully.");
                                        System.out.println("");
                                        System.out.println("");
                                    } else {
                                        System.out.println("Customer not found.");
                                        System.out.println("");
                                        System.out.println("");
                                    }
                                    break;

                                default:
                                    System.out.println("Invalid Choice. Please Try Again.");
                                    break;
                            }

                            if (receptionistChoice == 4) {
                                break;
                            }
                        }
                        // Receptionist functionality goes here

                    } else {
                        clearScreen();
                        System.out.println("Invalid Receptionist Username or Password!");
                        System.out.println("");
                        System.out.println("");

                    }

                    break;

                case 3:
                    System.out.print("Enter New Admin Username: ");
                    String newAdminUsername = scanner.nextLine();
                    System.out.print("Enter New Admin Password: ");
                    String newAdminPassword = scanner.nextLine();
                    if (adminLoginCredentials.containsKey(newAdminUsername)) {
                        System.out.println("Admin Username Already Exists!");
                    } else {
                        // Add new admin to the map
                        adminLoginCredentials.put(newAdminUsername, newAdminPassword);
                        clearScreen();
                        System.out.println("New Admin Added Successfully!");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

                    }

                    break;

                case 4:
                    clearScreen();
                    System.out.println("Thank you for using the Hotel Management System!");
                    System.out.println("");
                    System.out.println("");
                    return;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
                    break;
            }
        }
    }
}
