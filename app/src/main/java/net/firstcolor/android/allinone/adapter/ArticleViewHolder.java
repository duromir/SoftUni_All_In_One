package net.firstcolor.android.allinone.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.firstcolor.android.allinone.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticleViewHolder<Article> extends RecyclerView.ViewHolder {

    @BindView(R.id.article_title)
    TextView txtArticleTitle;
    @BindView(R.id.article_text)
    TextView getTxtArticleText;

    private Article article;

    public ArticleViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }


    public void setArticle(Article article) {
        this.article = article;
        //txtArticleTitle.setText();
    }
}
