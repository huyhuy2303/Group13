package PortManagement;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class PortRecordManagement {

    // Creating an empty LinkedList
    LinkedList<Port> list;

    // Default Constructor
    public void portRecordManagement() {
        list = new LinkedList<>();
    }

    public void add(Port port) {

        if (!find(port.getId())) {
            list.add(port);
        } else {

            // Print statement
            System.out.println(
                    "Record already exists in the Record list");
        }
    }

    public boolean find(String Id) {

        // Iterating record list
        // using for each loop
        for (Port l : list) {

            // Checking record by id Number
            if (Objects.equals(l.getId(), "Id")) {

                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    public void delete(int recIdNumber) {
        Port recordDel = null;

        // Iterating record list
        for (Port ll : list) {

            // Finding record to be deleted by id Number
            if (Objects.equals(ll.getId(), "recIdNumber")) {
                recordDel = ll;
            }
        }


        if (recordDel == null) {

            // Displaying no record found
            System.out.println("Invalid record Id");
        } else {

            list.remove(recordDel);


            System.out.println(
                    "Successfully removed record from the list");
        }
    }

    public Port findRecord(int idNumber) {

        // Iterate Record list
        // using for each loop
        for (Port l : list) {

            // Checking record by id Number.
            if (Objects.equals(l.getId(), "Id")) {
                return l;
            }
        }

        return null;
    }

    public void update(String Id, Scanner input) {

        if (find(String.valueOf(Integer.parseInt(Id)))) {
            Port rec = findRecord(Integer.parseInt(Id));

            // Display message only
            System.out.print(
                    "What is the new Port id Number ? ");
            Id = input.nextLine();

            // Display message only
            System.out.print(
                    "What is the new Port Name ? ");
            String name = input.nextLine();

            rec.setId(Id);
            rec.setName(name);
            System.out.println(
                    "Record Updated Successfully");
        } else {

            // Print statement
            System.out.println(
                    "Record Not Found in the Student list");
        }
    }

    public void display() {

        // If record list is empty then
        // print the message below
        if (list.isEmpty()) {

            // Print statement
            System.out.println("The list has no records\n");
        }
        // Iterating Record list
        // using for each loop
        for (Port record : list) {

            // Printing the list
            System.out.println(record.toString());
        }
    }
}
