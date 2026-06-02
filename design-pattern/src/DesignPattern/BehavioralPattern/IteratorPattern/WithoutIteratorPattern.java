package DesignPattern.BehavioralPattern.IteratorPattern;

import java.util.ArrayList;

class  Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}

 class BookCollection {
     private ArrayList<Book> books= new ArrayList<>();
     public  void  addBook(Book book){
         books.add(book);
     }

     public ArrayList<Book> getBook(){

         return books;
     }

         }
public class WithoutIteratorPattern {
    public static void main(String[] args) {
BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ book"));
        bookCollection.addBook(new Book("java book"));
        bookCollection.addBook(new Book("Phython book"));
  for(Book b : bookCollection.getBook()) {
      System.out.println(b.toString());
  }
    }
}
