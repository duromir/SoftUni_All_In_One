package net.firstcolor.android.allinone.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ArticleDao {

    @Query("SELECT * FROM articles")
    List<Article> getAll();
}
