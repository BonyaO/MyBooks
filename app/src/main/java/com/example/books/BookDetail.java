package com.example.books;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.books.databinding.ActivityBookDetailBinding;

public class BookDetail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Book book = getIntent().getParcelableExtra("Book");


        //TextView title = findViewById(R.id.title_label);
        //TextView subtitle = findViewById(R.id.subtitle_label);

        ActivityBookDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_book_detail);
        binding.setBook(book);
    }
}
