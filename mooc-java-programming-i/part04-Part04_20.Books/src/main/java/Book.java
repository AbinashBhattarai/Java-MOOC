public class Book {
    private String title;
    private int totalPages;
    private int publicationYear;

    public Book(String title, int totalPages, int publicationYear) {
        this.title = title;
        this.totalPages = totalPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.totalPages + " pages, " + this.publicationYear;
    }
}
