package nyc.c4q.java1105.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.java1105.R;

/**
 * Created by joannesong on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView author;
    private TextView year;

    public BookViewHolder(View itemView) {
        super(itemView); //super means we are going to use the same constructorour parent uses
        title = (TextView) itemView.findViewById(R.id.book_title_textview);
        author = (TextView) itemView.findViewById(R.id.book_author_textview);
        year = (TextView) itemView.findViewById(R.id.book_year_textview);
    }
    public void onBind(Book book){
        title.setText("Title: " + book.getTitle());
        author.setText(" Author: " + book.getAuthor());
        year.setText(" Year: " + book.getYear());
    }
}
