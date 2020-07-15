package library;

import java.util.ArrayList;

public class User {
    private String name;
    private String surname;
    private int userNumber;
    private ArrayList<Book> booksRented = new ArrayList<>();

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.userNumber = this.userNumber+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public ArrayList<Book> getBooksRented() {
        return this.booksRented;
    }

    public void setBooksRented(Book bookRented) {
        this.booksRented.add(bookRented);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userNumber=" + userNumber +
                '}';
    }
}
