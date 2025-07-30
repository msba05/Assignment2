import java.util.Arrays;

public class Sorter {

    // Selection Sort (O(n^2))
    public static void selectionSort(LinkedList<Student> list) {
        Node<Student> current = list.getHead();
        while (current != null) {
            Node<Student> min = current;
            Node<Student> next = current.next;
            while (next != null) {
                if (next.data.getGpa() < min.data.getGpa()) {
                    min = next;
                }
                next = next.next;
            }

            // Swap
            Student temp = current.data;
            current.data = min.data;
            min.data = temp;

            current = current.next;
        }
    }

    // Merge Sort (O(n log n))
    public static Node<Student> mergeSort(Node<Student> head) {
        if (head == null || head.next == null) return head;

        Node<Student> middle = getMiddle(head);
        Node<Student> nextOfMiddle = middle.next;
        middle.next = null;

        Node<Student> left = mergeSort(head);
        Node<Student> right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private static Node<Student> sortedMerge(Node<Student> a, Node<Student> b) {
        if (a == null) return b;
        if (b == null) return a;

        Node<Student> result;
        if (a.data.getGpa() <= b.data.getGpa()) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    private static Node<Student> getMiddle(Node<Student> head) {
        if (head == null) return head;
            Node<Student> slow = head;
            Node<Student> fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
    }

    public static void binarySearch(Student[] array, String name)
    {
        int left = 0;
        int right = array.length - 1;
        Arrays.sort(array, (a, b) -> a.getName().compareTo(b.getName()));

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = array[mid].getName().compareTo(name);

            if (cmp == 0) {
                System.out.println("Found: " + array[mid]);
                return;
            } else if (cmp < 0) {
                    left = mid + 1;
            } else {
                    right = mid - 1;
            }
        }
            System.out.println("Student not found.");
    }
}

