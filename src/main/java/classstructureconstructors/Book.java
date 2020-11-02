package classstructureconstructors;

public class Book {
    private String author;
    private String tittle;
    private int regNumber;

    public Book(String author, String tittle, int regNumber) {
        this.author = author;
        this.tittle = tittle;
        this.regNumber = regNumber;
    }

    public void register(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }

    public int getRegNumber() {
        return regNumber;
    }
}
