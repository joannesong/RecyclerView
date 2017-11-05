package nyc.c4q.java1105.model;

/**
 * Created by joannesong on 11/5/17.
 */

public class Book {
    private String title;
    private String author;
    private int year;

        public Book(String title, String author, int year){
            this.title = title;
            this.author = author;
            this.year = year;
        }
        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public int getYear(){
            return year;
        }
}
