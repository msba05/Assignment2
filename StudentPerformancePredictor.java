/*
 * This program uses linked lists and their capabilities to keep track of students names and their gpa and then decides if it is good or not
 * Written by Trevor Sanderson
 * Written on 7/27/25
 * JDK Version: 18.0.2.1
 */
package studentperformancepredictor;

public class StudentPerformancePredictor {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.insertAtTail(new Student("Alice", 3.8));
        studentList.insertAtTail(new Student("Bob", 2.7));
        studentList.insertAtTail(new Student("Charlie", 1.9));
        studentList.insertAtTail(new Student("Daisy", 3.2));

        System.out.println("Original List:");
        studentList.display();

        System.out.println("\nSorted by GPA (Selection Sort):");
        Sorter.selectionSort(studentList);
        studentList.display();

        System.out.println("\nSorted by GPA (Merge Sort):");
        Node<Student> sortedHead = Sorter.mergeSort(studentList.getHead());
        studentList = new LinkedList<>();
        while (sortedHead != null) {
            studentList.insertAtTail(sortedHead.data);
            sortedHead = sortedHead.next;
        }
        studentList.display();

        System.out.println("\nBinary Search by name 'Bob':");
        Student[] arr = studentList.toArray(new Student[0]);
        Sorter.binarySearch(arr, "Bob");
    }
}
