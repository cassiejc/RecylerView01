package com.example.recylerview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Book> booklist;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recylerview1);
        rv.setLayoutManager(new LinearLayoutManager(this));
        booklist = new ArrayList<Book>();

        booklist.add(new Book(R.drawable.cover1,getString(R.string.title01), getString(R.string.desc01)));
        booklist.add(new Book(R.drawable.cover2, getString(R.string.title02), getString(R.string.desc02)));
        booklist.add(new Book(R.drawable.cover3, getString(R.string.title03), getString(R.string.desc03)));

        customAdapter = new CustomAdapter(booklist);
        rv.setAdapter(customAdapter);
    }
}