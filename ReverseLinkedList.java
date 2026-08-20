import java.util.LinkedList;
import java.util.Random;

public class RevisedLinkedList {

    public static void main(String[] args) {

        LinkedList<Character> originalList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            char ch = (char) ('A' + random.nextInt(26));
            originalList.addLast(ch);
        }

        LinkedList<Character> reversedList = new LinkedList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            char currentElement = originalList.get(i);
            reversedList.addFirst(currentElement);
        }

        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }
}
