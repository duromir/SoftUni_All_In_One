package net.firstcolor.android.allinone;

import android.app.Activity;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
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
import net.firstcolor.android.allinone.data.DatabaseFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RecyclerViewActivity extends AppCompatActivity {


//    FloatingActionButton fabAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        (new ReadArticlesTask(this)).execute();
    }

    @OnClick({R.id.fab_add})
    public void fabAddClicked(View fab){
        Intent intent = new Intent(this, AddArticleActivity.class);
        startActivity(intent);
    }


    private static class ReadArticlesTask extends AsyncTask<Void, Void, List<Article>> {

        private RecyclerViewActivity activity;

        ReadArticlesTask(RecyclerViewActivity activity){
            this.activity = activity;
        }

        @Override
        protected List<Article> doInBackground(Void... voids) {
            return DatabaseFactory.getInstance(activity).articleDao().getAll();
        }

        @Override
        protected void onPostExecute(List<Article> articles) {
            RecyclerView recView = activity.findViewById(R.id.articles_rec_view);
            recView.setLayoutManager(new LinearLayoutManager(activity));
            ArticlesAdapter adapter = new ArticlesAdapter(articles);
            recView.setAdapter(adapter);
        }
    }

}
