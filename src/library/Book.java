package library;

import java.util.Date;

public class Book {
    private int itemNo;
    private String title;
    private String author;
    private int yearPublished;
    private int piecesInStock;
    private Date dateRented;
    private Date toReturn;

    public Book(String title, String author, int yearPublished, int piecesInStock) {
        this.itemNo = this.itemNo+1;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.piecesInStock = piecesInStock;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPiecesInStock() {
        return piecesInStock;
    }

    public void setPiecesInStock(int piecesInStock) {
        this.piecesInStock = piecesInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "itemNo=" + itemNo +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", piecesInStock=" + piecesInStock +
                '}';
    }
}
