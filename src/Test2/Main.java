package Test2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    static <T> void arrToCollections(T [] arr, Collection<T> c){
        for(T o: arr){
            c.add(o);
        }
    }


    public static void main(String[] args) {

        Collection<Book> col=new ArrayList<Book>();
        Book book1=new Book("Rise and Shine","John Smith");
        Book book2=new Book("Hello Smithy","John Fowler");
        Book book3=new Book("Who are you Mr. Smith","Tom Fowler");
        Book book4=new Book("Ziga Zaga","Will Churney");
        Book [] books=new Book [4];
        books[0]=book1;
        books[1]=book2;
        books[2]=book3;
        books[3]=book4;
        Main main=new Main();
        main.arrToCollections(books,col);
        System.out.println(Arrays.toString(col.toArray()));;




    }
}


