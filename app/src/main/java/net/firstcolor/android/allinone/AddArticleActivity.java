package net.firstcolor.android.allinone;

import android.arch.persistence.room.Database;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import net.firstcolor.android.allinone.data.Article;
import net.firstcolor.android.allinone.data.DatabaseFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddArticleActivity extends AppCompatActivity {

    @BindView(R.id.article_title_edt)
    EditText edtTitle;

    @BindView(R.id.article_text_edt)
    EditText edtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_article);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.fab_save})
    public void fabSaveClicked(View fabSave){
        (new SaveArticleTask(this)).execute();
    }

    protected void goBackAfterSave(){
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }


    private class SaveArticleTask extends AsyncTask<Void, Void, Boolean> {
        AddArticleActivity activity;
        protected SaveArticleTask(AddArticleActivity activity){
            this.activity = activity;
        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            DatabaseFactory.getInstance(activity)
                    .articleDao()
                    .insertArticle(new Article(edtTitle.getText().toString(), edtText.getText().toString()));
            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            activity.goBackAfterSave();
        }
    }

}
