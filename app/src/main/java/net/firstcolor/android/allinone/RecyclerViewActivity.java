package net.firstcolor.android.allinone;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import net.firstcolor.android.allinone.adapter.ArticlesAdapter;
import net.firstcolor.android.allinone.data.AppDatabase;
import net.firstcolor.android.allinone.data.Article;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recView = findViewById(R.id.articles_rec_view);
        recView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Article> articles = (ArrayList<Article>) getIntent().getSerializableExtra("articles");

        ArticlesAdapter adapter = new ArticlesAdapter(articles);
        recView.setAdapter(adapter);
    }

}
