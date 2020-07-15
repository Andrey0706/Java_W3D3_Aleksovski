package library;

import java.util.Scanner;

public class LibraryDemo {


    public static void main(String[] args) {
        Library booksForAll = new Library("Books For All", "Landstrasse 12");

        Book book1= new Book("The Forgotten Empire: The Battle For Earth", " Raymond L. Weil", 2020, 3);
        booksForAll.setBooks(book1);
        Book book2 = new Book("The Book You Wish Your Parents Had Read", "Philippa Perry", 2019, 2);
        booksForAll.setBooks(book2);
        Book book3 = new Book("LEARN Python", "Dominique SAGE", 2020, 5);
        booksForAll.setBooks(book3);
        Book book4 = new Book("The Secret Book Club", "Lyssa Kay Adams", 2020, 1);
        booksForAll.setBooks(book4);
        Book book5 = new Book("Flame of War", "Daniel Schinhofen", 2020, 2);
        booksForAll.setBooks(book5);

        User user1 = new User("a", "s");
        booksForAll.setUsers(user1);

        boolean proceed = true;
        while(proceed){

        System.out.println("Please press the appropriate number to select action");
        System.out.println("To add new user press 1");
        System.out.println("To add new book press 2");
        System.out.println("To rent a book to user press 3");
        System.out.println("To print all users press 4");
        System.out.println("To print all books press 5");
        System.out.println("To print all books from a user press 6");
        System.out.println("To exit press 7");
        Scanner in = new Scanner(System.in);
        int desiredAction = in.nextInt();

        switch(desiredAction) {
            case 1:
                System.out.println("Enter the name of the user");
                in = new Scanner(System.in);
                String name = in.nextLine();
                System.out.println("Enter the Surname of the user");
                in = new Scanner(System.in);
                String surname = in.nextLine();
                booksForAll.setUsers(new User(name, surname));
                System.out.println("User added to library");
                break;
            case 2:
                System.out.println("Enter detail for new book");
                System.out.println("Enter the name of the book");
                in = new Scanner(System.in);
                name = in.nextLine();
                System.out.println("Enter the author of the book");
                in = new Scanner(System.in);
                String author = in.nextLine();
                System.out.println("Enter the year the book is published");
                in = new Scanner(System.in);
                int yearPublished = in.nextInt();
                System.out.println("Enter the printed amount of the book in stock");
                in = new Scanner(System.in);
                int amount = in.nextInt();
                booksForAll.setBooks(new Book(name, author, yearPublished, amount));
                break;
            case 3:
                System.out.println("Which book you want to rent?");
                in = new Scanner(System.in);
                name = in.nextLine();
                boolean bookExists = false;
                for(Book book : booksForAll.getBooks()) {
                    System.out.println(book.getTitle());
                    System.out.println(name);
                    if (book.getTitle().equals(name)) {
                        bookExists = true;
                    }
                }
                System.out.println(booksForAll.getBooks());
                System.out.println(bookExists);
                    if(!bookExists) {
                        System.out.println("That book doesnt exists");
                        break;
                    }

                System.out.println("Which user want to rent it?");
                in = new Scanner(System.in);
                String username = in.nextLine();
                boolean userExists = false;

                for(User user : booksForAll.getUsers()) {
                    System.out.println(user.getName());
                    System.out.println(username);
                    if (user.getName().equals(username)) {
                        userExists = true;
                    }
                }
                System.out.println(booksForAll.getUsers());
                System.out.println(userExists);
                if(!userExists) {
                    System.out.println("That user doesnt exists");
                    break;
                }

                System.out.println("How many days to rent it?");
                in = new Scanner(System.in);
                int days = in.nextInt();
                System.out.println("booksForAll.rent(" + name + " " + username + " " + days + ")");
                booksForAll.rent(name, username, days);
                break;

            case 4:
                System.out.println("Printing all users");
                for (User user : booksForAll.getUsers()) {
                    System.out.println(user);
                }
                break;
            case 5:
                System.out.println("Printing all books");
                for (Book book : booksForAll.getBooks()) {
                    System.out.println(book.toString());
                }
                break;
            case 6:
                System.out.println("Which user you want to print the books for?");
                in = new Scanner(System.in);
                name = in.nextLine();
                User theUser = null;
                userExists = false;
                for(User user : booksForAll.getUsers()) {
                    if (user.getName().equals(name)) {
                        userExists = true;
                        theUser = user;
                        System.out.println("--name: "+ theUser.getName());
                    }
                }
                if(!userExists) {
                    System.out.println("That user doesnt exists");
                    break;
                }
                System.out.println("before for");
                System.out.println(theUser.getBooksRented().size());
                for(Book b : theUser.getBooksRented()){
                    System.out.println("line 135");
                    System.out.println("Book: " + b.toString());
                }
                System.out.println("after for");
                break;


            case 7:
                System.out.println("Thank you for using our library, bye");
                proceed = false;
                break;

        }

        }

    }



}
