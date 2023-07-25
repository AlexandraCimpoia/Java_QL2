import com.qa.Cat;
import com.qa.TestBooks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] arr = {"Mike", "Martina", "Peter"};
        TestBooks b1 = new TestBooks("title", arr, 10.99);
        TestBooks b2 = new TestBooks("title2", arr, 5.99);
        TestBooks b3 = new TestBooks("title3", arr, 1.00);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        TestBooks[] bookArray = new TestBooks[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;
        for (int x = 0; x < bookArray.length; x++) {
            System.out.println(bookArray[x]);
        }

        Cat cat = new Cat("Whiskers", 3, "Siamese");
        // Accessing attributes using getters
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Breed: " + cat.getBreed());

        // Changing attributes using setterscat.setName("Mittens");
        cat.setAge(5);
        cat.setBreed("Maine Coon");

        // Printing the updated Cat object
        System.out.println(cat);

        // Using toString method directly
        System.out.println(cat.toString());
    }
}