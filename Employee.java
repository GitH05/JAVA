import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {
        ArrayList<EmployeeEntity> empDetails = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        operation(empDetails, s);
    }

    public static class EmployeeEntity {
        int id;
        String name;
        String email;
        Long contact;
        String department;
        String city;

        // constructor
        EmployeeEntity(int id, String name, String email, Long contact, String department, String city) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.contact = contact;
            this.department = department;
            this.city = city;
        }

        public String toString() {
            return " Id:" + id + " Name:" + name + " Email:" + email + " Contact:" + contact + " Department:"
                    + department + " City:" + city + "\n";
        }
    }

    // operation
    public static void operation(ArrayList<EmployeeEntity> empDetails, Scanner s) {
        boolean running = true;
        while (running) {
            System.out.println("\n1.Add Employee Details:");
            System.out.println("2.Show Employee Details:");
            System.out.println("3.Delete Employee Details:");
            System.out.println("4.Update Employee Details;");
            System.out.println("5.Search Employee Details:");
            System.out.println("6.Sort Employee Details");
            System.out.println("7.Exit Program");

            System.out.print("\n-----Enter Your Choice:");
            int choice = 0;
            String choices = s.nextLine();
            if (!choices.isEmpty()) {
                choice = Integer.parseInt(choices);
            }
            switch (choice) {
                case 1:
                    addData(empDetails, s);
                    break;
                case 2:
                    showData(empDetails);
                    break;
                case 3:
                    deleteData(empDetails, s);
                    break;
                case 4:
                    updateData(empDetails, s);
                    break;
                case 5:
                    searchData(empDetails, s);
                    break;
                case 6:
                    sortData(empDetails, s);
                    break;
                case 7:
                    running = false;
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    // addEmployeeDetails
    public static void addData(ArrayList<EmployeeEntity> empDetails, Scanner s) {
        while (true) {
            System.out.print("Id: ");
            String id = s.nextLine();
            int id1 = 0;
            if (!id.isEmpty()) {
                id1 = Integer.parseInt(id);
            } // can skip
            System.out.print("Name: ");
            String name = s.nextLine();
            System.out.print("Email: ");
            String email = s.nextLine();
            System.out.print("Contact: ");
            String contact = s.nextLine();
            long contact1 = 0;
            if (!contact.isEmpty()) {
                contact1 = Long.parseLong(contact);
            } // can skip
            System.out.print("Department: ");
            String department = s.nextLine();
            System.out.print("City: ");
            String city = s.nextLine();

            // addDetails to ArrayList:
            empDetails.add(new EmployeeEntity(id1, name, email, contact1, department, city));

            System.out.print("Type 'exit' to stop or press 'Enter' to continue: ");
            String choice = s.nextLine();
            if (choice.equalsIgnoreCase("exit")) {
                break;
            }
        }

    }

    // showEmployeeDetails
    public static void showData(ArrayList<EmployeeEntity> empDetails) {
        if (empDetails.isEmpty()) {
            System.out.println("No Data Found!");
        } else {
            for (EmployeeEntity emp : empDetails) {
                System.out.print(emp);
            }
        }
    }

    // deleteEmployeeDetails
    public static void deleteData(ArrayList<EmployeeEntity> empDetails, Scanner s) {
        if (empDetails.isEmpty()) {
            System.out.println("No Data Found!");
        } else {
            boolean running = true;
            while (running) {
                System.out.println("Enter 'id' to delete Data");
                int id = s.nextInt();
                s.nextLine();

                boolean found = false;

                for (int i = 0; i < empDetails.size(); i++) {
                    if (empDetails.get(i).id == id) {
                        empDetails.remove(i); // safe in indexed loop
                        System.out.println("Data Deleted!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid ID");
                }

                running = false;
            }
        }
    }

    // updateEmployeeDetails
    public static void updateData(ArrayList<EmployeeEntity> empDetails, Scanner s) {
        if (empDetails.isEmpty()) {
            System.out.println("No Data Found");
            return;
        }

        System.out.print("Enter Employee ID to update: ");
        int eId = s.nextInt();
        s.nextLine();

        boolean found = false;

        for (EmployeeEntity emp : empDetails) {
            if (emp.id == eId) {
                System.out.println(emp);
                found = true;

                System.out.println("\n1. Update Id");
                System.out.println("2. Update Name");
                System.out.println("3. Update Email");
                System.out.println("4. Update Contact");
                System.out.println("5. Update Department");
                System.out.println("6. Update City");
                System.out.print("Enter your choice: ");
                int opt = s.nextInt();
                s.nextLine();

                switch (opt) {
                    case 1:
                        System.out.print("Update ID (" + emp.id + "): ");
                        int uId = s.nextInt();
                        s.nextLine();
                        if (uId >= 0) {
                            emp.id = uId;
                            System.out.println("Successfully updated ID.");
                        } else {
                            System.out.println("Invalid ID.");
                        }
                        break;

                    case 2:
                        System.out.print("Update Name (" + emp.name + "): ");
                        String uName = s.nextLine();
                        if (!uName.isEmpty()) {
                            emp.name = uName;
                            System.out.println("Successfully updated Name.");
                        }
                        break;

                    case 3:
                        System.out.print("Update Email (" + emp.email + "): ");
                        String uEmail = s.nextLine();
                        if (!uEmail.isEmpty()) {
                            emp.email = uEmail;
                            System.out.println("Successfully updated Email.");
                        }
                        break;

                    case 4:
                        System.out.print("Update Contact (" + emp.contact + "): ");
                        String contactInput = s.nextLine();
                        if (!contactInput.isEmpty()) {
                            try {
                                long uContact = Long.parseLong(contactInput);
                                emp.contact = uContact;
                                System.out.println("Successfully updated Contact.");
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid contact number.");
                            }
                        }
                        break;

                    case 5:
                        System.out.print("Update Department (" + emp.department + "): ");
                        String uDepartment = s.nextLine();
                        if (!uDepartment.isEmpty()) {
                            emp.department = uDepartment;
                            System.out.println("Successfully updated Department.");
                        }
                        break;

                    case 6:
                        System.out.print("Update City (" + emp.city + "): ");
                        String uCity = s.nextLine();
                        if (!uCity.isEmpty()) {
                            emp.city = uCity;
                            System.out.println("Successfully updated City.");
                        }
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }

                break; // Employee found and processed, exit loop
            }
        }

        if (!found) {
            System.out.println("Employee ID not found.");
        }
    }

    // searchEmployeeDetails
    public static void searchData(ArrayList<EmployeeEntity> empDetails, Scanner s) {
        if (empDetails.isEmpty()) {
            System.out.println("No Data Found!");
        } else {
            boolean running = true;
            while (running) {
                System.out.println("Enter 'id' to search Data");
                int id = s.nextInt();
                s.nextLine();

                boolean found = false;

                for (EmployeeEntity emp : empDetails) {
                    if (emp.id == id) {
                        System.out.println(emp);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid ID");
                }

                running = false;
            }
        }
    }

    // sortEmployeeDetails
    public static void sortData(ArrayList<EmployeeEntity> empDetails, Scanner s) {
        if (empDetails.isEmpty()) {
            System.out.println("No Data Found!");
        } else {
            System.out.println("Sort based on: \n1. Name \n2. City \n3. Department");
            System.out.print("Enter Your Choice: ");

            int choice = 0;
            String input = s.nextLine();
            if (!input.isEmpty()) {
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    return;
                }
            }

            switch (choice) {
                case 1:
                    empDetails.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));
                    break;
                case 2:
                    empDetails.sort((e1, e2) -> e1.city.compareToIgnoreCase(e2.city));
                    break;
                case 3:
                    empDetails.sort((e1, e2) -> e1.department.compareToIgnoreCase(e2.department));
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }
            System.out.println("Sorted Employee Details:");
            for (EmployeeEntity emp : empDetails) {
                System.out.println(emp);
            }
        }
    }

    // exitProgram
    public static void exitProgram() {
        System.out.println("Exiting Program");
    }
}