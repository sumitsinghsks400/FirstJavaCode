package DesignPattern.BehavioralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T> {
  boolean hasNext();
  T next();



}

class  Books {
    private String title;

    public Books(String title) {
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

class BookCollections {
    private ArrayList<Books> books= new ArrayList<>();
    public  void  addBook(Books book){
        books.add(book);
    }

    public ArrayList<Books> getBook(){

        return books;
    }

    public Iterator<Books>  CreateIterator() {
        return  new BookIterator(this.books);
    }

}

// another class nest class
class  BookIterator implements Iterator<Books> {
    private List<Books> books;
    private  int position =0;

    public   BookIterator (List<Books> books) {
        this.books=books;
    }

    @Override
    public boolean hasNext() {
        return position <books.size();
    }

    @Override
    public Books next() {
        return books.get(position++);
    }
}


public class WithIteratorPattern {
    public static void main(String[] args) {
        BookCollections bookCollection = new BookCollections();
        bookCollection.addBook(new Books("C++ book"));
        bookCollection.addBook(new Books("java book"));
        bookCollection.addBook(new Books("Phython book"));
      Iterator<Books>  iterator= bookCollection.CreateIterator();
      while(iterator.hasNext()) {
        Books book = iterator.next();
        System.out.println(book);


//        for(Books b : bookCollection.getBook()) {
//
//            System.out.println(b.toString());
//        }
    }
    }
}
