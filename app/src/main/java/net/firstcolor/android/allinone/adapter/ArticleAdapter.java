package net.firstcolor.android.allinone.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.firstcolor.android.allinone.R;
import net.firstcolor.android.allinone.data.Article;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {

    private List<Article> articles;

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //return null;
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.database_item, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Article article = articles.get(position);
        holder.setArticle(article);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}
