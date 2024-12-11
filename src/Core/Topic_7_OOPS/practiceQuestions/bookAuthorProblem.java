package Core.Topic_7_OOPS.practiceQuestions;

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;

    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Author() {
        System.out.println(author);
    }

    public void Author(String name) {
        this.author = name;
    }

    public void grtPrice() {
        System.out.println(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class bookAuthorProblem {
    public static void main(String[] args) {
        Book b1 = new Book("atomic habit", "ryudyard kipling", 20000);
    }

}
