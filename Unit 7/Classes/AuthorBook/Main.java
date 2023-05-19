public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Doe");

        System.out.println(author.getFirstName());  // Output: John
        System.out.println(author.getLastName());   // Output: Doe

        author.setFirstName("Jane");
        author.setLastName("Smith");

        System.out.println(author.getFirstName());  // Output: Jane
        System.out.println(author.getLastName());   // Output: Smith

        System.out.println(author.toString());      // Output: Author: Jane Smith
    }
}