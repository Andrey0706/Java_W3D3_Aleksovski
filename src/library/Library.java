package library;

import java.util.ArrayList;

public class Library {
    private String name;
    private String address;
    private ArrayList<String> keys = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> booksRented = new ArrayList<>();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(User user) {
        this.users.add(user);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksRented() {
        return booksRented;
    }

    public void setBooksRented(Book booksRented) {
        this.booksRented.add(booksRented);
    }

    public void rent(String book, String user, int daysToRent){
        System.out.println("rent() starts, number of users: " + this.users.size());
        for(User u : this.users){
            if(u.getName().equals(user)){
               User userToRent = u;
               System.out.println("userToRent:" + userToRent.getName());
                for(Book b : books){
                    if(b.getTitle().equals(book)){
                        Book bookToRent = b;
                        System.out.println("bookTorent:" + bookToRent.getTitle());
                        System.out.println("the name " + userToRent.getName() + " the book " + bookToRent.getTitle());
                        userToRent.setBooksRented(bookToRent);
                        bookToRent.setPiecesInStock(bookToRent.getPiecesInStock()-1);
                    }
                }
            }
        }


        }
    }
