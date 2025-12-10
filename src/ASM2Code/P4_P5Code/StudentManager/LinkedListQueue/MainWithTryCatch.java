package ASM2Code.P4_P5Code.StudentManager.LinkedListQueue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainWithTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RegistrationQueue queue = new RegistrationQueue();

        while (true) {
            try {
                // MENU
                System.out.println("\nStudent Management - LinkedList (Queue) Structure");
                System.out.println("1. Add students (enqueue)");
                System.out.println("2. Delete the first student (dequeue - FIFO)");
                System.out.println("3. See first student (peek)");
                System.out.println("4. Search by ID (Linear Search)");
                System.out.println("5. Search by ID (Binary Search)");
                System.out.println("6. Bubble Sort (by name)");
                System.out.println("7. Quick Sort (in descending order of grade)");
                System.out.println("8. Show list");
                System.out.println("9. Edit student by ID");
                System.out.println("10. Delete student by ID");
                System.out.println("0. Exit");
                System.out.print("Select: ");

                int c = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (c) {

                    case 1:  // ADD
                        System.out.print("ID: ");
                        String id = sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Grade (0 - 10): ");
                        String markStr = sc.nextLine();
                        double mark = Double.parseDouble(markStr);

                        queue.enqueue(new Student(id, name, mark));
                        System.out.println("Added student to list (LinkedList Queue)!");
                        break;

                    case 2:  // dequeue
                        Student served = queue.dequeue();
                        if (served == null)
                            System.out.println("The list is empty, there are no students to delete.");
                        else
                            System.out.println("First student deleted: " + served);
                        break;

                    case 3:  // peek
                        Student first = queue.peek();
                        System.out.println(first == null ? "Empty list." : first);
                        break;

                    case 4:  // Linear search
                        System.out.print("Enter the ID you want to find (Linear Search): ");
                        String searchID = sc.nextLine();

                        if (searchID.trim().isEmpty())
                            throw new IllegalArgumentException("ID cannot be blank!");

                        Integer.parseInt(searchID); // force numeric format

                        Student found = queue.search(searchID);
                        System.out.println(found == null ? "Not found." : found);
                        break;

                    case 5:  // Binary search
                        System.out.print("Enter ID to search (Binary Search): ");
                        String searchID2 = sc.nextLine();

                        if (searchID2.trim().isEmpty())
                            throw new IllegalArgumentException("ID cannot be blank!");

                        Integer.parseInt(searchID2);

                        Student found2 = queue.binarySearchById(searchID2);
                        System.out.println(found2 == null ? "Not found." : found2);
                        break;

                    case 6:  // Bubble Sort
                        queue.bubbleSortByName();
                        break;

                    case 7:  // Quick Sort by mark
                        queue.quickSortByMarkDesc();
                        break;

                    case 8:  // Display
                        queue.display();
                        break;

                    case 9:  // EDIT by ID
                        System.out.print("Enter the ID you want to edit: ");
                        String editID = sc.nextLine();

                        if (editID.trim().isEmpty())
                            throw new IllegalArgumentException("ID cannot be blank!");

                        Integer.parseInt(editID); // must be numeric

                        System.out.print("New name: ");
                        String newName = sc.nextLine();

                        System.out.print("New mark (0–10): ");
                        String newMarkStr = sc.nextLine();
                        double newMark = Double.parseDouble(newMarkStr);

                        boolean edited = queue.edit(editID, newName, newMark);
                        System.out.println(edited ? "Student updated successfully!" :
                                "No student exists with this ID.");
                        break;

                    case 10:  // DELETE by ID
                        System.out.print("Enter the ID you want to delete: ");
                        String delID = sc.nextLine();

                        if (delID.trim().isEmpty())
                            throw new IllegalArgumentException("ID cannot be blank!");

                        Integer.parseInt(delID);

                        boolean deleted = queue.deleteById(delID);
                        System.out.println(deleted ? "Student deleted successfully!" :
                                "No student exists with this ID.");
                        break;

                    case 0:
                        System.out.println("Exit the program.");
                        return;

                    default:
                        System.out.println("There is no option for this.");
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Error: You must enter numbers in the menu (no letters!).");
                sc.nextLine();
            }
            catch (NumberFormatException e) {
                System.out.println("Error: ID must be an integer (no letters or characters allowed!).");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Unknown error: " + e.getMessage());
            }
        }
    }
}
