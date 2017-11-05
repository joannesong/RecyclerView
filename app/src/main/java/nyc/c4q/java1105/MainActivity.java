package nyc.c4q.java1105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.java1105.model.Book;
import nyc.c4q.java1105.model.BookAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.bookRe);
        List<Book> books = new ArrayList<>();



        books.add(new Book("Harry Potter", "JK Rowling", 1998));
        books.add(new Book("Lord of the Flies", "William Golding", 1954));
        books.add(new Book("Sanditon", "Jane Austen", 1815));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1812));
        books.add(new Book("Sense and Sensibilities", "Jane Austen", 1813));
        books.add(new Book("Angels and Demons", "Dan Brown", 2003));
        books.add(new Book("The Da Vinci Code", "Dan Brown", 2000));

        BookAdapter bookAdapter = new BookAdapter(books);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
