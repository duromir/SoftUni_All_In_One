package net.firstcolor.android.allinone.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Article {

    @PrimaryKey
    private int id;

    @ColumnInfo(name="title")
    private String title;

    @ColumnInfo(name="text")
    private String text;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
