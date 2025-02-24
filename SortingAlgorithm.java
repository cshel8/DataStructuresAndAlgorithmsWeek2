import java.util.Arrays;
public class SortingAlgorithm {
    public static void main(String[] args) {
        String books[] = {"War and Peace",
                "Pride and Prejudice",
                "The Bible",
                "Jane Eyre",
                "Alice's Adventures in Wonderland"
        };
        System.out.println("Before sorting: " + Arrays.toString(books));
        sSort(books);
        System.out.println("After sorting: " + Arrays.toString(books));
    }
    private static void sSort(String[] books){
        for (int i = 0; i < books.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[j].compareTo(books[minIdx]) < 0)
                    minIdx = j;
            }
            if (minIdx != i) {
                String tempBook = books[minIdx];
                books[minIdx] = books[i];
                books[i] = tempBook;
            }
        }
    }
}