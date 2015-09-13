package se.sunkingofthemind.assignment4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alrik on 2015-04-23.
 */
/*public class PlanetListAdapter extends ArrayAdapter<Planet> {
ArrayList<Planet> PlanetList;
    Context c;

}*/

/*
public class MyListAdapter extends ArrayAdapter<Book> {
    ArrayList<Book> booksList;
    Context c;

    public MyListAdapter(Context context, ArrayList<Book> booksList) {
        super(context, 0, booksList);
        this.booksList = booksList;
        this.c = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("MyListAdapter", "Called for position: " + position);
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item,null);
        Book b = booksList.get(position);
        TextView tv = (TextView) convertView.findViewById(R.id.tv_title);
        ImageView iv = (ImageView) convertView.findViewById(R.id.iv_bookcover);
        tv.setText(b.getTitle());
        iv.setImageDrawable(b.getImage());
        return convertView;
    }
}*/